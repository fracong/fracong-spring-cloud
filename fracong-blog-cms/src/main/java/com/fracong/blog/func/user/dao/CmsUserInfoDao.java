package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.CmsUserInfo;
import com.fracong.blog.func.user.entity.CmsUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserInfoDao {
    long countByExample(CmsUserInfoExample example);

    int deleteByExample(CmsUserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(CmsUserInfo record);

    int insertSelective(CmsUserInfo record);

    List<CmsUserInfo> selectByExampleWithBLOBs(CmsUserInfoExample example);

    List<CmsUserInfo> selectByExample(CmsUserInfoExample example);

    CmsUserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") CmsUserInfo record, @Param("example") CmsUserInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsUserInfo record, @Param("example") CmsUserInfoExample example);

    int updateByExample(@Param("record") CmsUserInfo record, @Param("example") CmsUserInfoExample example);

    int updateByPrimaryKeySelective(CmsUserInfo record);

    int updateByPrimaryKeyWithBLOBs(CmsUserInfo record);
}