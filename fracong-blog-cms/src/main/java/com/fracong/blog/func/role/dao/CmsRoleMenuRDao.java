package com.fracong.blog.func.role.dao;

import com.fracong.blog.func.role.entity.CmsRoleMenuR;
import com.fracong.blog.func.role.entity.CmsRoleMenuRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsRoleMenuRDao {
    long countByExample(CmsRoleMenuRExample example);

    int deleteByExample(CmsRoleMenuRExample example);

    int deleteByPrimaryKey(String relationId);

    int insert(CmsRoleMenuR record);

    int insertSelective(CmsRoleMenuR record);

    List<CmsRoleMenuR> selectByExample(CmsRoleMenuRExample example);

    CmsRoleMenuR selectByPrimaryKey(String relationId);

    int updateByExampleSelective(@Param("record") CmsRoleMenuR record, @Param("example") CmsRoleMenuRExample example);

    int updateByExample(@Param("record") CmsRoleMenuR record, @Param("example") CmsRoleMenuRExample example);

    int updateByPrimaryKeySelective(CmsRoleMenuR record);

    int updateByPrimaryKey(CmsRoleMenuR record);
}