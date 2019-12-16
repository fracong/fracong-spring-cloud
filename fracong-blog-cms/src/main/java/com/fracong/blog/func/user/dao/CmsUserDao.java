package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.CmsUser;
import com.fracong.blog.func.user.entity.CmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserDao {
    long countByExample(CmsUserExample example);

    int deleteByExample(CmsUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    List<CmsUser> selectByExample(CmsUserExample example);

    CmsUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByExample(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);

	CmsUser selectByLoginName(String loginName);
	
	CmsUser queryUserInfoByUserId(CmsUserExample example);
}