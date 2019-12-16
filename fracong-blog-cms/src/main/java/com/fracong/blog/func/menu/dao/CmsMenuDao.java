package com.fracong.blog.func.menu.dao;

import com.fracong.blog.func.menu.entity.CmsMenu;
import com.fracong.blog.func.menu.entity.CmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMenuDao {
    long countByExample(CmsMenuExample example);

    int deleteByExample(CmsMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(CmsMenu record);

    int insertSelective(CmsMenu record);

    List<CmsMenu> selectByExample(CmsMenuExample example);

    CmsMenu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") CmsMenu record, @Param("example") CmsMenuExample example);

    int updateByExample(@Param("record") CmsMenu record, @Param("example") CmsMenuExample example);

    int updateByPrimaryKeySelective(CmsMenu record);

    int updateByPrimaryKey(CmsMenu record);
}