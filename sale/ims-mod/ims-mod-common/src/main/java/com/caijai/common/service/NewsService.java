package com.caijai.common.service;

import org.springframework.web.multipart.MultipartFile;

public interface NewsService {

	String upload(MultipartFile file);
}
