package com.fracong.blog.func.content.service;

import java.util.Date;

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
		BlogContent newBlogContent = new BlogContent();
		newBlogContent.setContentId(id);
		newBlogContent.setViewNum(blogContent.getViewNum()+1);
		blogContentDao.updateByPrimaryKeySelective(newBlogContent);
		return blogContent;
	}

	public void insertContent(BlogContent content) {
		content.setContentId(1L);
		content.setUpdateTime(new Date());
		content.setCreateTime(new Date());
		String[] split = content.getContent().split("\n|\r");
		String contentNew = "";
		for (String p : split) {
			if(!p.startsWith("<p>")){
				p = "<p>"+p;
			}
			if(!p.endsWith("</p>")){
				p +="</p>";
			}
			contentNew +=p;
		}
		content.setContent(contentNew);
		blogContentDao.updateByPrimaryKeySelective(content);
	}

}
