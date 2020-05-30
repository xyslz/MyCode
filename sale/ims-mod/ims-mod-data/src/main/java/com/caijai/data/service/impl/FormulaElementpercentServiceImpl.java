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
import com.caijai.data.service.FormulaElementpercentService;

@Service
public class FormulaElementpercentServiceImpl extends DMLServiceSupport<FormulaElementpercent>
		implements FormulaElementpercentService {

	@Autowired
	private BaseDao<FormulaElementpercent> feBaseDao;

	@Override
	@Transactional
	public Map<String, Object> saves(FormulaElementpercent e) {
		Map<String, Object> map = new HashMap<>();
		FormulaElementpercent formulaElementpercent = new FormulaElementpercent();
		formulaElementpercent.setItemFormula(e.getItemFormula());
		formulaElementpercent.setElement(e.getElement());
		formulaElementpercent.setElementID(e.getElementID());
		formulaElementpercent.setElementName(e.getElementName());
		formulaElementpercent.setElementCode(e.getElementCode());
		List<FormulaElementpercent> list = feBaseDao.getListByParam(formulaElementpercent);
		if(StringUtil.IsNullOrEmpty(e.getId())) {
			if(list != null) {
				map.put("success", false);
				map.put("msg", "失败,已有此元素,请确认后重新输入");
				return map;
			}
		}else {
			FormulaElementpercent fl = feBaseDao.getById(e.getId());
			if(!e.getElement().equals(fl.getElement())) {
				if(list != null) {
					map.put("success", false);
					map.put("msg", "失败,已有此元素,请确认后重新输入");
					return map;
				}
			}
		}
		map.put("success", true);
		map.put("result", super.save(e));
		return map;
	}

}
