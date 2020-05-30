package com.caijai.data.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.ItemMasterSub;
import com.caijai.data.mapper.ItemMasterSubMapper;
import com.caijai.data.service.ItemMasterSubService;
import com.caijai.sysuser.util.MySession;

/**
 * Title: ItemMasterSubServiceDML生产副产品
 * <p>
 * Description: <br>
 * 
 * @author 杨雪景
 * @date 2019年4月24日
 */
@Service
public class ItemMasterSubServiceImpl extends DMLServiceSupport<ItemMasterSub> implements ItemMasterSubService {

	@Autowired
	private BaseDao<ItemMasterSub> dao;

	@Autowired
	private ItemMasterSubMapper mapper;

	@Override
	@Transactional
	public Map<String, Object> update(ItemMasterSub itemMasterSub) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (itemMasterSub.getSubProductsName().endsWith("test")) {
			ItemMasterSub item = mapper.getBySkin(itemMasterSub.getMainProducts(), itemMasterSub.getId());
			if (item != null) {
				map.put("msg", "当前主产品下已存在废料泥：" + item.getSubProductsName());
				return map;
			}
		} else if (itemMasterSub.getSubProductsName().endsWith("皮")) {
			ItemMasterSub item = mapper.getByMud(itemMasterSub.getMainProducts(), itemMasterSub.getId());
			if (item != null) {
				map.put("msg", "当前主产品下已存在废料皮：" + item.getSubProductsName());
				return map;
			}
		}
		if (StringUtil.IsNullOrEmpty(itemMasterSub.getId())) {
			itemMasterSub.setId(StringUtil.uuid());
			itemMasterSub.setCreatedBy(MySession.currentUser().getUsername());
			itemMasterSub.setCreatedOn(DateUtil.nowDate());
			map.put("result", dao.add(itemMasterSub));
			return map;
		} else {
			itemMasterSub.setModifiedBy(MySession.currentUser().getUsername());
			itemMasterSub.setModifiedOn(DateUtil.nowDate());
			map.put("result", dao.modify(itemMasterSub));
			return map;
		}
	}

	/**
	 * @author 杨雪景
	 * @date 2019年4月28日
	 * @param itemMasterSub
	 * @return
	 */
	@Override
	public List<ItemMasterSub> queryList(ItemMasterSub itemMasterSub) {
		return dao.getListByParam(itemMasterSub);
	}

	@Override
	@Transactional
	public Map<String, Object> importItemSub(List<ItemMasterSub> list) {
		Map<String, Object> map = new HashMap<String, Object>();
		int addCount = 0, modifyCount = 0;
		for (int i = 0; i < list.size(); i++) {
			ItemMasterSub sub = dao.getById(list.get(i).getId());
			if (sub == null) {
				addCount++;
				list.get(i).setCreatedBy(MySession.currentUser().getUsername());
				list.get(i).setCreatedOn(DateUtil.nowDate());
				dao.add(list.get(i));
			} else {
				modifyCount++;
				list.get(i).setModifiedBy(MySession.currentUser().getUsername());
				list.get(i).setModifiedOn(DateUtil.nowDate());
				dao.modify(list.get(i));
			}
		}
		map.put("result", "当前导入操作，新增数据" + addCount + "条，修改数据" + modifyCount + "条");
		return map;
	}

	@Override
	public List<ItemMasterSub> getListByItem(ItemMasterSub itemMasterSub) {
		return mapper.getListByItem(itemMasterSub.getMainProducts(), itemMasterSub.getType().getIndex());
	}

	@Override
	@Transactional
	public List<ItemMasterSub> saveList(List<Map<String, Object>> sublist) {
		List<ItemMasterSub> newList = new ArrayList<>();
		dao.mapToObject(sublist).forEach(sub -> {
			newList.add(save(sub));
		});
		return newList;
	}

	@Override
	public List<ItemMasterSub> getList(ItemMasterSub sub) {
		return dao.getListByParam(sub);
	}

	
}
