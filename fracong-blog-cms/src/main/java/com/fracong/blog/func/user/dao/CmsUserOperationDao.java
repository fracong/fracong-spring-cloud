package com.fracong.blog.func.user.dao;

import com.fracong.blog.func.user.entity.CmsUserOperation;
import com.fracong.blog.func.user.entity.CmsUserOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserOperationDao {
    long countByExample(CmsUserOperationExample example);

    int deleteByExample(CmsUserOperationExample example);

    int deleteByPrimaryKey(String operationId);

    int insert(CmsUserOperation record);

    int insertSelective(CmsUserOperation record);

    List<CmsUserOperation> selectByExample(CmsUserOperationExample example);

    CmsUserOperation selectByPrimaryKey(String operationId);

    int updateByExampleSelective(@Param("record") CmsUserOperation record, @Param("example") CmsUserOperationExample example);

    int updateByExample(@Param("record") CmsUserOperation record, @Param("example") CmsUserOperationExample example);

    int updateByPrimaryKeySelective(CmsUserOperation record);

    int updateByPrimaryKey(CmsUserOperation record);
}