package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.BlogUser;
import com.fracong.blog.func.user.entity.BlogUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogUserDao {
    long countByExample(BlogUserExample example);

    int deleteByExample(BlogUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    List<BlogUser> selectByExample(BlogUserExample example);

    BlogUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByExample(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByPrimaryKeySelective(BlogUser record);

    int updateByPrimaryKey(BlogUser record);

	BlogUser selectByLoginName(String loginName);
	
	BlogUser queryUserInfoByUserId(BlogUserExample example);
}