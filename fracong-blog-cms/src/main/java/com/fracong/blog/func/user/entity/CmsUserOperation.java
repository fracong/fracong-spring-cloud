package com.fracong.blog.func.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * blog_cms_user_operation
 * @author 
 */
public class CmsUserOperation implements Serializable {
    private String operationId;

    private String operationName;

    private String operationBrief;

    /**
     * 0基本等级操作
     */
    private Short operationType;

    private String operationTag;

    private String createId;

    private Date createTime;

    /**
     * 0正常，1删除
     */
    private Short deleteFlg;

    private String lastmodifyId;

    private Date lastmodifyTime;

    private static final long serialVersionUID = 1L;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationBrief() {
        return operationBrief;
    }

    public void setOperationBrief(String operationBrief) {
        this.operationBrief = operationBrief;
    }

    public Short getOperationType() {
        return operationType;
    }

    public void setOperationType(Short operationType) {
        this.operationType = operationType;
    }

    public String getOperationTag() {
        return operationTag;
    }

    public void setOperationTag(String operationTag) {
        this.operationTag = operationTag;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public String getLastmodifyId() {
        return lastmodifyId;
    }

    public void setLastmodifyId(String lastmodifyId) {
        this.lastmodifyId = lastmodifyId;
    }

    public Date getLastmodifyTime() {
        return lastmodifyTime;
    }

    public void setLastmodifyTime(Date lastmodifyTime) {
        this.lastmodifyTime = lastmodifyTime;
    }
}