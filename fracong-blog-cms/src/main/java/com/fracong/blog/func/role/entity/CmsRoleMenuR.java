package com.fracong.blog.func.role.entity;

import java.io.Serializable;

/**
 * blog_cms_role_menu_r
 * @author 
 */
public class CmsRoleMenuR implements Serializable {
    private String relationId;

    private String roleId;

    private String menuId;

    private static final long serialVersionUID = 1L;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}