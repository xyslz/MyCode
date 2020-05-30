package com.caijai.person.service.dml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.person.entity.EmployeeArchive;
import com.caijai.person.mapper.EmployeeArchiveMapper;
import com.caijai.person.service.EmployeeArchiveService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;

@Service
public class EmployeeArchiveDML extends DMLServiceSupport<EmployeeArchive> implements EmployeeArchiveService {

	@Autowired
	private EmployeeArchiveMapper employeeArchiveMapper;

	@Override
	public PageInfo<Map<String, Object>> queryPageByShift(PageInfo<Map<String, Object>> pageInfo,
			EmployeeArchive employeeArchive) {
		SysUser sysUser = MySession.currentUser();
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		int count = employeeArchiveMapper.getCountByShift(sysUser.getCorpPk(), DateUtil.nowDate(),
				employeeArchive.getName(), employeeArchive.getDept());
		// 如果没有查到相关信息条数，则直接返回
		if (count == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(count);
		mapInfo.put("endPos", pageInfo.getEndPos());
		mapInfo.put("startPos", pageInfo.getStartPos());
		List<Map<String, Object>> list = employeeArchiveMapper.queryPageByShift(mapInfo, sysUser.getCorpPk(),
				DateUtil.nowDate(), employeeArchive.getName(), employeeArchive.getDept());
		pageInfo.setRows(list);
		return pageInfo;
	}

}
