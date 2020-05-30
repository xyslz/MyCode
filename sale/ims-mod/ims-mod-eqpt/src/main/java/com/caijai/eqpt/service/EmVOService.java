package com.caijai.eqpt.service;

import com.caijai.eqpt.entity.vo.EmVO;

public interface EmVOService {

	EmVO getById(String id);

	EmVO query(EmVO em);

}
