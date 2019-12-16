package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.CmsUserRoleRExample;
import com.fracong.blog.func.user.entity.CmsUserRoleRKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserRoleRDao {
    long countByExample(CmsUserRoleRExample example);

    int deleteByExample(CmsUserRoleRExample example);

    int deleteByPrimaryKey(CmsUserRoleRKey key);

    int insert(CmsUserRoleRKey record);

    int insertSelective(CmsUserRoleRKey record);

    List<CmsUserRoleRKey> selectByExample(CmsUserRoleRExample example);

    int updateByExampleSelective(@Param("record") CmsUserRoleRKey record, @Param("example") CmsUserRoleRExample example);

    int updateByExample(@Param("record") CmsUserRoleRKey record, @Param("example") CmsUserRoleRExample example);
}