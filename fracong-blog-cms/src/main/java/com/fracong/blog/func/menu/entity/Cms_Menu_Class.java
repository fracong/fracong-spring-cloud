package com.fracong.blog.func.menu.entity;

import java.io.Serializable;

/**
 * blog_cms_menu_class
 * @author 
 */
public class Cms_Menu_Class implements Serializable {
    private String menuCssClass;

    private String menuName;

    private static final long serialVersionUID = 1L;

    public String getMenuCssClass() {
        return menuCssClass;
    }

    public void setMenuCssClass(String menuCssClass) {
        this.menuCssClass = menuCssClass;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}