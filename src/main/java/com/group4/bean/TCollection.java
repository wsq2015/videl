package com.group4.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 收藏表
 * Created by Administrator on 2017/8/15.
 */
@Data
public class TCollection{
    private Integer collectionId;//主键
    private Integer userId;//用户
    private Integer videlId;//音频

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
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
}
