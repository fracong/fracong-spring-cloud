package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.BlogUserInfo;
import com.fracong.blog.func.user.entity.BlogUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogUserInfoDao {
    long countByExample(BlogUserInfoExample example);

    int deleteByExample(BlogUserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(BlogUserInfo record);

    int insertSelective(BlogUserInfo record);

    List<BlogUserInfo> selectByExampleWithBLOBs(BlogUserInfoExample example);

    List<BlogUserInfo> selectByExample(BlogUserInfoExample example);

    BlogUserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") BlogUserInfo record, @Param("example") BlogUserInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogUserInfo record, @Param("example") BlogUserInfoExample example);

    int updateByExample(@Param("record") BlogUserInfo record, @Param("example") BlogUserInfoExample example);

    int updateByPrimaryKeySelective(BlogUserInfo record);

    int updateByPrimaryKeyWithBLOBs(BlogUserInfo record);
}