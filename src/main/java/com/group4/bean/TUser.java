package com.group4.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * Created by Administrator on 2017/8/15.
 */
public class TUser implements Serializable {
    private Integer userId;//主键 用户ID
    private String userName;//用户名
    private String password;//密码
    private String email;//邮箱
    private String headImage;//头像存储路径
    private Date signTime;//注册时间
    private Integer sole;//权限
    private Integer userStatus;//状态


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getSole() {
        return sole;
    }

    public void setSole(Integer sole) {
        this.sole = sole;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
