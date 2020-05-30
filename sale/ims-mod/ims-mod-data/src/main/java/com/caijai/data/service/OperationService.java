package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Operation;

public interface OperationService {

	PageInfo<Operation> queryPage(PageInfo<Operation> pageInfo, Operation operation, String moDocNo);

}
