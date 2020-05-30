package com.caijai.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.QRCode;
import com.caijai.data.service.QRCodeService;

@Service
public class QRCodeServiceImpl extends DMLServiceSupport<QRCode> implements QRCodeService{
	
	@Autowired
	private BaseDao<QRCode> dao;

	@Override
	public QRCode getCode(QRCode code) {
		return dao.getByParam(code);
	}

	@Override
	public List<QRCode> getListCode(QRCode code) {
		return dao.getListByParam(code);
	}
	
}