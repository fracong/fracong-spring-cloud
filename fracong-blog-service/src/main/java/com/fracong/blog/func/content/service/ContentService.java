package com.fracong.blog.func.content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.blog.func.content.dao.BlogContentDao;
import com.fracong.blog.func.content.entity.BlogContent;

@Service
public class ContentService {
	@Autowired
	private BlogContentDao blogContentDao;

	public BlogContent getContentById(Long id) {
		BlogContent blogContent = blogContentDao.selectByPrimaryKey(id);
		return blogContent;
	}

}
