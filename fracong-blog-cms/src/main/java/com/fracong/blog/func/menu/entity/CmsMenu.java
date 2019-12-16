package com.fracong.blog.func.menu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * blog_cms_menu
 * @author 
 */
public class CmsMenu implements Serializable {
    private String menuId;

    private String menuKey;

    private String menuName;

    private String menuUrl;

    /**
     * 0不打开新的页面，1打开新的页面
     */
    private Short openType;

    /**
     * 0正常1删除
     */
    private Short deleteFlg;

    private String parentMenuId;

    private Integer orderNum;

    private String menuCreateId;

    private Date menuCreateTime;

    private String menuLastmodifyId;

    private Date menuLastmodifyTime;

    private String menuCssClass;

    private static final long serialVersionUID = 1L;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Short getOpenType() {
        return openType;
    }

    public void setOpenType(Short openType) {
        this.openType = openType;
    }

    public Short getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getMenuCreateId() {
        return menuCreateId;
    }

    public void setMenuCreateId(String menuCreateId) {
        this.menuCreateId = menuCreateId;
    }

    public Date getMenuCreateTime() {
        return menuCreateTime;
    }

    public void setMenuCreateTime(Date menuCreateTime) {
        this.menuCreateTime = menuCreateTime;
    }

    public String getMenuLastmodifyId() {
        return menuLastmodifyId;
    }

    public void setMenuLastmodifyId(String menuLastmodifyId) {
        this.menuLastmodifyId = menuLastmodifyId;
    }

    public Date getMenuLastmodifyTime() {
        return menuLastmodifyTime;
    }

    public void setMenuLastmodifyTime(Date menuLastmodifyTime) {
        this.menuLastmodifyTime = menuLastmodifyTime;
    }

    public String getMenuCssClass() {
        return menuCssClass;
    }

    public void setMenuCssClass(String menuCssClass) {
        this.menuCssClass = menuCssClass;
    }
}