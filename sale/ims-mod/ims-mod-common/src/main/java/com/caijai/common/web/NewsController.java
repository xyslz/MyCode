package com.caijai.common.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.caijai.common.entity.News;
import com.caijai.common.service.NewsService;
import com.caijai.common.service.dml.NewsDML;

@Controller
@RequestMapping("news.do")
public class NewsController {
	
	@Autowired
	private NewsDML newsDML;
	
	@Autowired 
	private NewsService newsService;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, News news) {
		return newsDML.queryPage(pageNumber, pageSize, news);
	}
	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(News news) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", newsDML.save(news));
		return map;
	}
	
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(News news) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", newsDML.invalid(news));
		return map;
	}
	
	@RequestMapping(params = "upload")
	@ResponseBody
	public Map<String, Object> upload(News news,@RequestParam(value = "file", required = false) MultipartFile file) {
		Map<String, Object> map = new HashMap<>();
		String newFileName = newsService.upload(file);
		newsDML.save(news);
		return map;
	}
}
