package com.caijai.data.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Category;
import com.caijai.data.entity.ItemMaster;
import com.caijai.data.entity.ItemMasterSub;
import com.caijai.data.entity.vo.ItemMasterVo;
import com.caijai.data.entity.vo.PartVO;
import com.caijai.data.mapper.ItemMasterSubMapper;
import com.caijai.data.mapper.PartMapper;
import com.caijai.data.service.ItemMasterService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;
import com.caijai.task.entity.SyncTasks;
import com.caijai.task.service.fun.SyncTasksFUN;

@Service("itemMasterService")
public class ItemMasterServiceImpl extends DMLServiceSupport<ItemMasterVo> implements ItemMasterService {
	
	@Autowired
	private BaseDao<ItemMaster> itemMasterDao;
	
	@Autowired
	private BaseDao<ItemMasterVo> itemMasterVoDao;

	@Autowired
	private BaseDao<Category> categoryDao;
	
	@Autowired
	private PartMapper mapper;
	
	@Autowired
	private SyncTasksFUN tasksFun;
	
	@Autowired
	private BaseDao<ItemMasterSub> subDao;

	@Autowired
	private ItemMasterSubMapper subMapper;
	
	@Override
	public PageInfo<ItemMaster> queryPage(PageInfo<ItemMaster> pageInfo, ItemMaster inventory) {
		return itemMasterDao.queryPage(pageInfo, inventory);
	}
	
	@Override
	public PageInfo<Category> queryPageCate(PageInfo<Category> pageInfo, Category category) {
		return categoryDao.queryPage(pageInfo, category);
	}

	@Override
	@Transactional
	public ItemMasterVo save(ItemMasterVo inventory) {
		SysUser user=MySession.currentUser();
		if (StringUtil.IsNullOrEmpty(inventory.getId())) {
			inventory.setId(StringUtil.uuid());
			inventory.setCreatedBy(user.getUsername());
			inventory.setCreatedOn(DateUtil.nowDate());
			inventory.setOrg(user.getCorpPk());
			return itemMasterVoDao.add(inventory);
		}else {
			inventory.setModifiedBy(user.getUsername());
			inventory.setModifiedOn(DateUtil.nowDate());
			return itemMasterVoDao.modify(inventory);
		}
	}

	@Override
	@Transactional
	public boolean invalid(ItemMaster inventory) {
		return itemMasterDao.invalidByPk(inventory);
	}
	
	@Override
	public List<ItemMaster> queryList(List<String> idList) {
		return itemMasterDao.queryList(idList);
	}

	@Override
	public PageInfo<PartVO> queryPagePart(PageInfo<PartVO> pageInfo, Map<String, Object> param) {
		param.put("org", MySession.currentUser().getCorpPk());
		int total = mapper.getTotalCount(param);
		pageInfo.setTotal(total);
		param.put("pageInfo", pageInfo);
		if (total == 0) {
			return pageInfo;
		}
		List<PartVO> list = mapper.queryPage(param);
		pageInfo.setRows(list);
		return pageInfo;
	}

	@Override
	public ItemMasterVo getItem(ItemMasterVo item) {
		return itemMasterVoDao.getByParam(item);
	}
	
	@Override
	public ItemMaster getById(String id) {
		return itemMasterDao.getById(id);
	}
	
	@Override
	public int sync() {
		// 同步Sync_MO_Production存储过程
		SyncTasks task = new SyncTasks();
		task.setStprocedure("Sync_BD_Item");
		task.setSyspreset(SYSSET.Y);
		return tasksFun.taskRun(task);
	}

	@Override
	@Transactional
	public ItemMasterVo syncSub(ItemMasterVo itemVo) {
		Double lp = itemVo.getLp();
		Double ln = itemVo.getLn();
		if (StringUtil.IsNullOrEmpty(itemVo.getId())) {
			ItemMaster item = new ItemMaster();
			item.setSegment1(itemVo.getSegment1());
			List<ItemMaster> list = itemMasterDao.getListByParam(item);
			list.forEach(it -> {
				itemMasterDao.modify(it);
				ItemMasterSub sub = new ItemMasterSub();
				sub.setMainProducts(it.getId());
				List<ItemMasterSub> subs = subDao.getListByParam(sub);
				if (subs == null) {
					subMapper.privateByproduct(it.getCode(), it.getOrg(), lp, ln);
				}
			});
		} else {
			// 变更料品
			itemVo = itemMasterVoDao.modify(itemVo);
			subMapper.privateByproduct(itemVo.getCode(), itemVo.getOrg(), lp, ln);
		}
		return itemVo;
	}

}