package com.caijai.repair.mapper;

import java.util.List;

import com.caijai.repair.entity.po.Emprojectline;

public interface EmprojectLineMapper {

	List<Emprojectline> queryListByEm(String emGroupid);
}
