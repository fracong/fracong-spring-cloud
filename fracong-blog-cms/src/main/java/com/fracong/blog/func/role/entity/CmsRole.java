package com.fracong.blog.func.role.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * blog_cms_role
 * @author 
 */
public class CmsRole implements Serializable {
    private String roleId;

    private String roleName;

    private String roleEnName;

    private String roleBrief;

    private Date roleCreateTime;

    private String roleCreateId;

    /**
     * 0正常，1删除
     */
    private Short roleStateFlag;

    private Date roleLastmodifyTime;

    private String roleLastmodifyId;

    private static final long serialVersionUID = 1L;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleEnName() {
        return roleEnName;
    }

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName;
    }

    public String getRoleBrief() {
        return roleBrief;
    }

    public void setRoleBrief(String roleBrief) {
        this.roleBrief = roleBrief;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public String getRoleCreateId() {
        return roleCreateId;
    }

    public void setRoleCreateId(String roleCreateId) {
        this.roleCreateId = roleCreateId;
    }

    public Short getRoleStateFlag() {
        return roleStateFlag;
    }

    public void setRoleStateFlag(Short roleStateFlag) {
        this.roleStateFlag = roleStateFlag;
    }

    public Date getRoleLastmodifyTime() {
        return roleLastmodifyTime;
    }

    public void setRoleLastmodifyTime(Date roleLastmodifyTime) {
        this.roleLastmodifyTime = roleLastmodifyTime;
    }

    public String getRoleLastmodifyId() {
        return roleLastmodifyId;
    }

    public void setRoleLastmodifyId(String roleLastmodifyId) {
        this.roleLastmodifyId = roleLastmodifyId;
    }
}