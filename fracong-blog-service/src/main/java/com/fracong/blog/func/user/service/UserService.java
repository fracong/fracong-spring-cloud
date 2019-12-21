package com.fracong.blog.func.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.blog.func.user.dao.BlogUserDao;
import com.fracong.blog.func.user.entity.BlogUser;

@Service
public class UserService {
	@Autowired
	private BlogUserDao blogUserDao;

	public BlogUser selectByLoginName(String loginName) {
		BlogUser user = null;
		try {
			user = blogUserDao.selectByLoginName(loginName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
