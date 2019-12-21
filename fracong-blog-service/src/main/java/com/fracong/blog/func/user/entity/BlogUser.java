package com.fracong.blog.func.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * blog_cms_user
 * @author 
 */
public class BlogUser implements Serializable {
    private String userId;

    private String userName;

    private String userEnName;

    private String loginName;

    private String userPassword;

    private Short sex;

    private String brief;

    private Date birthDate;

    private String positionCountry;

    private String positionProvince;

    private String positionCity;

    private String positionOtherDetail;

    private String mobilePhone;

    private String workPhone;

    /**
     * 冻结状态 0 未冻结 1 已冻结
     */
    private Short statusFlag;

    private Date createTime;

    /**
     * 删除状态 0未删除 1已删除
     */
    private Short deleteFlag;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEnName() {
        return userEnName;
    }

    public void setUserEnName(String userEnName) {
        this.userEnName = userEnName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPositionCountry() {
        return positionCountry;
    }

    public void setPositionCountry(String positionCountry) {
        this.positionCountry = positionCountry;
    }

    public String getPositionProvince() {
        return positionProvince;
    }

    public void setPositionProvince(String positionProvince) {
        this.positionProvince = positionProvince;
    }

    public String getPositionCity() {
        return positionCity;
    }

    public void setPositionCity(String positionCity) {
        this.positionCity = positionCity;
    }

    public String getPositionOtherDetail() {
        return positionOtherDetail;
    }

    public void setPositionOtherDetail(String positionOtherDetail) {
        this.positionOtherDetail = positionOtherDetail;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public Short getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Short statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}