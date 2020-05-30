package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.FormulaElementpercent;
import com.caijai.data.entity.ItemFormula;
import com.caijai.data.service.ItemFormulaService;
import com.caijai.sysuser.util.MySession;

@Service
public class ItemFormulaServiceImpl extends DMLServiceSupport<ItemFormula> implements ItemFormulaService{

	@Autowired
	private BaseDao<ItemFormula> ifBaseDao;
	
	@Autowired
	private BaseDao<FormulaElementpercent> feBaseDao;
	
	@Override
	@Transactional
	public Map<String, Object> saves(ItemFormula itemFormula) {
		Map<String, Object> map = new HashMap<>();
		if(StringUtil.IsNullOrEmpty(itemFormula.getId())) {
			ItemFormula formula = new ItemFormula();
			formula.setCode(itemFormula.getCode());
			List<ItemFormula> list = ifBaseDao.getListByParam(formula);
			if(list != null) {
				map.put("success", false);
				map.put("msg", "配方编号重复,请重新输入");
				return map;
			}
			ItemFormula iformula = new ItemFormula();
			iformula.setFlag(itemFormula.getFlag());
			iformula.setItemMaster(itemFormula.getItemMaster());
			List<ItemFormula> ifList = ifBaseDao.getListByParam(iformula);
			if(ifList != null) {
				map.put("success", false);
				map.put("msg", "料品物料类型重复,请重新输入");
				return map;
			}
		}else {
			ItemFormula formula = ifBaseDao.getById(itemFormula.getId());
			if(!itemFormula.getItemMaster().equals(formula.getItemMaster()) || !itemFormula.getFlag().equals(formula.getFlag())) {
				ItemFormula iformula = new ItemFormula();
				iformula.setFlag(itemFormula.getFlag());
				iformula.setItemMaster(itemFormula.getItemMaster());
				List<ItemFormula> ifList = ifBaseDao.getListByParam(iformula);
				if(ifList != null) {
					map.put("success", false);
					map.put("msg", "料品物料类型重复,请重新输入");
					return map;
				}
				if(!itemFormula.getFlag().equals(formula.getFlag())){
					FormulaElementpercent fePercent = new FormulaElementpercent();
					fePercent.setItemFormula(itemFormula.getId());
					List<FormulaElementpercent> feList = feBaseDao.getListByParam(fePercent);
					if(feList != null) {
						for (FormulaElementpercent formulaElementpercent : feList) {
							formulaElementpercent.setFlag(itemFormula.getFlag());
							formulaElementpercent.setModifiedBy(MySession.currentUser().getUsername());
							feBaseDao.modify(formulaElementpercent);
						}
					}
				}
			}
		}
		map.put("success", true);
		map.put("result", super.save(itemFormula));
		return map;
	}

}
