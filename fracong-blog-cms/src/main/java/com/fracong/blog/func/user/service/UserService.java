package com.fracong.blog.func.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.blog.func.user.dao.CmsUserDao;
import com.fracong.blog.func.user.entity.CmsUser;

@Service
public class UserService {
	@Autowired
	private CmsUserDao cmsUserDao;

	public CmsUser selectByLoginName(String loginName) {
		CmsUser user = null;
		try {
			user = cmsUserDao.selectByLoginName(loginName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
