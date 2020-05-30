package com.caijai.data.service;

import java.util.List;

import com.caijai.data.entity.QRCode;

public interface QRCodeService {

	QRCode getCode(QRCode code);

	List<QRCode> getListCode(QRCode code);

}
