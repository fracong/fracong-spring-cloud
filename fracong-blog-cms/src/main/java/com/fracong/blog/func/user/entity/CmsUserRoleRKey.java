package com.fracong.blog.func.user.entity;

import java.io.Serializable;

/**
 * blog_cms_user_role_r
 * @author 
 */
public class CmsUserRoleRKey implements Serializable {
    private String userId;

    private String roleId;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}