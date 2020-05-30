package com.caijai.data.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.sysenum.SupplierState;
import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.sysenum.UserType;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.QRCode;
import com.caijai.base.util.StringUtil;
import com.caijai.data.api.SupplierQualityApi;
import com.caijai.data.dao.SupplierDao;
import com.caijai.data.entity.Supplier;
import com.caijai.data.mapper.SupplierMapper;
import com.caijai.data.service.SupplierService;
import com.caijai.email.util.SendEmail;
import com.caijai.sysuser.entity.SupplierOrg;
import com.caijai.sysuser.entity.SysDictionaryDetail;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;
import com.caijai.sysuser.util.PasswordUtil;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private BaseDao<Supplier> supplierDao;

	@Autowired
	private SupplierDao dao;

	@Autowired
	private BaseDao<SysUser> sysUserDao;

	@Autowired
	private BaseDao<SysDictionaryDetail> sysdetaildao;

	@Autowired
	private BaseDao<SupplierOrg> supOrgDao;

	@Autowired
	private SendEmail sendEmail;

	@Autowired
	private SupplierMapper mapper;

//	@Autowired
	private SupplierQualityApi supApi;

	@Override
	public PageInfo<Supplier> queryPage(PageInfo<Supplier> pageInfo, Supplier supplier) {
		return supplierDao.queryPage(pageInfo, supplier);
	}

	@Override
	public Map<String, Object> queryPageByParam(String pageNumber, String pageSize, Supplier supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Supplier> pageInfo = new PageInfo<Supplier>(pageNumber, pageSize);
		pageInfo = dao.queryPageByParam(pageInfo, supplier);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	@Override
	@Transactional
	public Supplier save(Supplier supplier) {
		if (StringUtil.IsNullOrEmpty(supplier.getId())) {
			Supplier s = new Supplier();
			s.setId(supplier.getId());
			s.setCode(supplier.getCode());
			Supplier s1 = supplierDao.getByParam(s);
			if (s1 != null) {
				throw new RuntimeException("供应商编码" + supplier.getCode() + "已存在，请确认");
			}
			supplier.setCreatedBy(MySession.currentUser().getUsername());
			supplier.setCreatedOn(DateUtil.nowDate());
			supplier.setSyncSource("IMS");
			supplier.setState(SupplierState.UnVerified);
			supplier.setId(UUID.randomUUID().toString());
			if (!StringUtil.IsNullOrEmpty(supplier.getTrade())) {
				// 添加供应商资质模板 取供应商id
				supApi.addQuality(supplier);
			}
			return supplierDao.add(supplier);
		} else {
			if (!StringUtil.IsNullOrEmpty(supplier.getTrade())) {
				// 添加供应商资质模板
				supApi.addQuality(supplier);
			}
			return supplierDao.modify(supplier);
		}

	}

	@Override
	@Transactional
	public boolean invalid(Supplier supplier) {
		// 删除供应商资质
		supApi.deleteQuality(supplier);
		return supplierDao.invalidByPk(supplier);
	}

	@Override
	@Transactional
	public Map<String, Object> saveSupplierUser(List<Supplier> supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		String msg = "";
		List<SysUser> sys = new ArrayList<SysUser>();
		for (int i = 0; i < supplier.size(); i++) {
			SysUser user = new SysUser();
			user.setUsercode(supplier.get(i).getCode());
			// 判断当前生成的用户是否存在
			user.setDr(0);
			SysUser sysuser = sysUserDao.getByParam(user);
			if (sysuser == null) {
				// Role roles = roleDao.getById("supplierUser");
				user.setId(StringUtil.uuid());
				// 初始密码为123456
				user.setPassword(PasswordUtil.initPaw(""));
				user.setCreatetime(DateUtil.nowDate());
				user.setCreator(MySession.currentUser().getUsername());
				user.setCorpPk(MySession.currentUser().getCorpPk());
				user.setCompany(MySession.currentUser().getCompany());
				user.setUsername(supplier.get(i).getName());
				user.setShowName(supplier.get(i).getName());
				user.setSupplierID(supplier.get(i).getId());
				// user.setRoleName(roles.getRoleName());
				// user.setMail(supplier.get(i).getEmail());
				user.setIsState(U9STATE.valid);
				// TODO 如何取供应商管理员用户 默认赋值为供应商用户
				// user.setRoleID(roles.getId());
				// 为供应商用户
				user.setUserType(UserType.SupplierUser);
				user = PasswordUtil.encryption(user);
				// 新增用户绑定角色
				/*
				 * UserRole role = new UserRole();
				 * role.setId(StringUtil.uuid());
				 * role.setCreateTime(DateUtil.nowDate());
				 * role.setOrg(MySession.currentUser().getCorpPk());
				 * role.setRoleID(roles.getId());
				 * role.setRoleName(roles.getRoleName());
				 * role.setUserID(user.getId()); userRoleDao.add(role);
				 */
				sys.add(sysUserDao.add(user));
				SupplierOrg suporg = supOrgDao.getById(supplier.get(i).getId());
				if (suporg == null) {
					// 如果不存在供应商组织关系则新增
					SupplierOrg org = new SupplierOrg();
					org.setId(supplier.get(i).getId());
					org.setCode(user.getUsername());
					org.setCode(user.getUsercode());
					org.setShortName(user.getShowName());
					org.setEmail(user.getMail());
					org.setIsEff("1");
					org.setCreatedBy(MySession.currentUser().getUsername());
					supOrgDao.add(org);
				}
				// 添加供应商资质模板
				// supApi.addQuality(supplier.get(i));
			} else {
				if (i == supplier.size() - 1) {
					msg += supplier.get(i).getCode();
				} else {
					msg += supplier.get(i).getCode() + ",";
				}
			}
		}
		if (!StringUtil.IsNullOrEmpty(msg)) {
			map.put("msg", "供应商编码为" + msg + "的用户已存在，请至用户档案查看");
		}
		map.put("result", sys);
		return map;
	}

	@Override
	public List<Supplier> chooseSupplier(Supplier supplier) {
		return mapper.chooseSupplier(MySession.currentUser().getCorpPk(), supplier.getCode());
	}

	/**
	 * 供应商邀约<br>
	 * 发送邮件
	 * 
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Map<String, Object> invitation(Supplier supplier) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (!SupplierState.Verified.equals(supplier.getState())) {
			supplier.setState(SupplierState.Verifying);
			supplier.setInvitationOn(DateUtil.nowDate());
			supplier.setInvitationBy(MySession.currentUser().getUsername());
			supplier = supplierDao.modify(supplier);
		}
		sendEmail(supplier);
		map.put("supplier", supplier);
		return map;
	}

	// 获取供应商填写资质地址
	public SysDictionaryDetail getAddress(String org, String code) {
		SysDictionaryDetail sysdetail = new SysDictionaryDetail();
		sysdetail.setDicCode("DIC0009");
		sysdetail.setCode(code);
		sysdetail.setOrg(org);
		return sysdetaildao.getByParam(sysdetail);
	}

	// 发送邮件
	private void sendEmail(Supplier supplier) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		SysDictionaryDetail pc = getAddress(supplier.getOrg(), "DIC0009-1");
		SysDictionaryDetail pda = getAddress(supplier.getOrg(), "DIC0009-2");
		map.put("to", supplier.getEmail());
		map.put("copyto", supplier.getMailbox());

		// 图片内容
		String text = pda.getValue() + "?link=" + supplier.getId();
		// 返回图片保存路径
		String file = QRCode.addQRCode(300, 300, text, "suplierLoginCode.jpg");

		String msg = "<h3>供应商：" + supplier.getCode() + "--" + supplier.getName() + "</h3>" + "<h3>供应商资质信息填写：<a href='"
				+ pc.getValue() + "?link=" + supplier.getId() + "'>点此跳转</a></h3>" + "<img src=\"cid:image\"/>";

		map.put("mess", msg);

		map.put("org", MySession.currentUser().getCorpPk());
		String subject = "来自贝亲（" + MySession.currentUser().getOrgCode() + "）IMS系统的合作邀约信息";
		map.put("subject", subject);
		map.put("type", "0");
		// 邮件附件
		map.put("file", file);
		// 附件名称
		map.put("fileName", "SRMCode");
		sendEmail.send(map);
	}

	@Override
	public List<Supplier> operateSupplier(List<Supplier> list) {
		for (int i = 0; i < list.size(); i++) {
			if (SupplierState.Hang.getValue().equals(list.get(i).getSupState())) {
				list.get(i).setHolddate(DateUtil.nowDate());
				list.get(i).setHolduser(MySession.currentUser().getUsername());
			} else if (SupplierState.UnVerified.getValue().equals(list.get(i).getSupState())) {
				list.get(i).setReleasedate(DateUtil.nowDate());
				list.get(i).setReleaseuser(MySession.currentUser().getUsername());
			} else if (SupplierState.BlackList.getValue().equals(list.get(i).getSupState())) {
				list.get(i).setBlackOn(DateUtil.nowDate());
				list.get(i).setBlackBy(MySession.currentUser().getUsername());
			} else if (SupplierState.Verified.getValue().equals(list.get(i).getSupState())
					|| SupplierState.DisableTrade.getValue().equals(list.get(i).getSupState())) {
				// 供应商审核时同时审核供应商资质
				checkQuality(list.get(i));
				checkSendEmail(list.get(i));
				list.get(i).setReviewOn(DateUtil.nowDate());
				list.get(i).setReviewBy(MySession.currentUser().getUsername());
			}
			list.get(i).setState(SupplierState.get(list.get(i).getSupState()));
			list.set(i, supplierDao.modify(list.get(i)));
		}
		return list;
	}

	/**
	 * 审核供应商资质
	 * 
	 * @param supplier
	 */
	private void checkQuality(Supplier supplier) {
		if (SupplierState.Verified.getValue().equals(supplier.getSupState())) {
			// 供应商资质审核，修改状态及审核信息
			mapper.updateQuality(supplier.getId(), DateUtil.nowDate(), MySession.currentUser().getUsername());
		}
	}

	/**
	 * 供应商审核时发送邮件
	 */
	private void checkSendEmail(Supplier supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("to", supplier.getEmail());
		map.put("copyto", supplier.getMailbox());
		SysDictionaryDetail pc = getAddress(supplier.getOrg(), "DIC0009-1");
		String msg = "<h3>供应商：" + supplier.getCode() + "--" + supplier.getName() + "</h3>";

		if (SupplierState.Verified.getValue().equals(supplier.getSupState())) {
			msg = msg + "<h3>已通过贝亲（" + MySession.currentUser().getOrgCode() + "）公司的审核，可进行交易</h3>";
		} else {
			msg = msg + "<h3>未通过贝亲（" + MySession.currentUser().getOrgCode() + "）公司的审核，不可进行交易</h3>" 
					  + "<h3>不可进行交易的的原因为：" + supplier.getDisableReason() + "</h3>"
					  + "<h3>可重新变更资质信息： <a href='" + pc.getValue() + "?link=" + supplier.getId() + "'>点此跳转</a></h3>";
		}
		map.put("mess", msg);
		map.put("org", MySession.currentUser().getCorpPk());
		String subject = "来自贝亲（" + MySession.currentUser().getOrgCode() + "）IMS系统的审核";
		map.put("subject", subject);
		map.put("type", "0");
		sendEmail.send(map);
	}

}