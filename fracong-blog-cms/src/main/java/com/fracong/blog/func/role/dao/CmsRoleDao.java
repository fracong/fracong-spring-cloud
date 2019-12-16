package com.fracong.blog.func.role.dao;

import com.fracong.blog.func.role.entity.CmsRole;
import com.fracong.blog.func.role.entity.CmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsRoleDao {
    long countByExample(CmsRoleExample example);

    int deleteByExample(CmsRoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(CmsRole record);

    int insertSelective(CmsRole record);

    List<CmsRole> selectByExample(CmsRoleExample example);

    CmsRole selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") CmsRole record, @Param("example") CmsRoleExample example);

    int updateByExample(@Param("record") CmsRole record, @Param("example") CmsRoleExample example);

    int updateByPrimaryKeySelective(CmsRole record);

    int updateByPrimaryKey(CmsRole record);
}