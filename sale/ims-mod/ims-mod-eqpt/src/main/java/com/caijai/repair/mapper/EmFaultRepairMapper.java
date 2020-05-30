package com.caijai.repair.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.repair.entity.EmFaultRepair;

public interface EmFaultRepairMapper {

	List<EmFaultRepair> queryList(@Param("faultCode") String faultCode, @Param("faultPart") String faultPart,
			@Param("groupID") String groupID, @Param("emid") String emid);

}
