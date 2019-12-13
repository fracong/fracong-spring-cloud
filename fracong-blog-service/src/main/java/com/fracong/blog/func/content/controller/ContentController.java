package com.fracong.blog.func.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fracong.blog.func.content.entity.BlogContent;
import com.fracong.blog.func.content.service.ContentService;

@RestController
@RequestMapping("/content")
public class ContentController {
	@Autowired
	private ContentService contentService;
	
	@GetMapping("/getContent/{id}")
	public String getContent(@PathVariable(name="id") Long id){
		BlogContent content = contentService.getContentById(id);
		String returnStr = JSON.toJSONStringWithDateFormat(content, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteMapNullValue);
		return returnStr;
	}
}
