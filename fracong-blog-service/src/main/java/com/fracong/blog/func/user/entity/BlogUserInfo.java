package com.fracong.blog.func.user.entity;

import java.io.Serializable;

/**
 * blog_cms_user_info
 * @author 
 */
public class BlogUserInfo implements Serializable {
    private String userId;

    /**
     * 操作权限数据
     */
    private String operationData;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperationData() {
        return operationData;
    }

    public void setOperationData(String operationData) {
        this.operationData = operationData;
    }
}