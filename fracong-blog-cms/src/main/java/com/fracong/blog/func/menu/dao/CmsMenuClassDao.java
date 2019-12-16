package com.fracong.blog.func.menu.dao;

import com.fracong.blog.func.menu.entity.Cms_Menu_Class;
import com.fracong.blog.func.menu.entity.Cms_Menu_ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMenuClassDao {
    long countByExample(Cms_Menu_ClassExample example);

    int deleteByExample(Cms_Menu_ClassExample example);

    int deleteByPrimaryKey(String menuCssClass);

    int insert(Cms_Menu_Class record);

    int insertSelective(Cms_Menu_Class record);

    List<Cms_Menu_Class> selectByExample(Cms_Menu_ClassExample example);

    Cms_Menu_Class selectByPrimaryKey(String menuCssClass);

    int updateByExampleSelective(@Param("record") Cms_Menu_Class record, @Param("example") Cms_Menu_ClassExample example);

    int updateByExample(@Param("record") Cms_Menu_Class record, @Param("example") Cms_Menu_ClassExample example);

    int updateByPrimaryKeySelective(Cms_Menu_Class record);

    int updateByPrimaryKey(Cms_Menu_Class record);
}