package com.group4.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论表
 * Created by Administrator on 2017/8/15.
 */
@Data
public class TComment{
    private Integer commentId;//主键
    private Integer userId;//用户
    private Integer videlId;//视频
    private String commentInfo;//评论内容
    private Date commentTime;//评论时间

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVidelId() {
        return videlId;
    }

    public void setVidelId(Integer videlId) {
        this.videlId = videlId;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
