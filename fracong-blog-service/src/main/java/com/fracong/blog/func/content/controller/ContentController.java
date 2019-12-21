package com.fracong.blog.func.content.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/getContent/{id}.html")
	public String getContent(@PathVariable(name="id") Long id){
		BlogContent content = contentService.getContentById(id);
		String returnStr = JSON.toJSONStringWithDateFormat(content, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteMapNullValue);
		return returnStr;
	}
	
	@PostMapping("/insertContent/{key}")
	public String insertContent(@PathVariable(name="key") String key,
			@RequestBody BlogContent content) throws Exception{
		String retrunStr = "false";
		File file = new File("/opt/key.txt");
		//File file = new File("G:\\key.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(file),"UTF-8");
		BufferedReader br = new BufferedReader(read);
		String text = "";
		String textLine = null;
		while((textLine =br.readLine()) != null){
			text += textLine;
		}
		read.close();
		if(StringUtils.isNotBlank(text) && text.equals(key)) {
			contentService.insertContent(content);
			retrunStr = "ok";
		}
		return retrunStr;
	}
}
