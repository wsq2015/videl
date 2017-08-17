package com.group4.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 关注表
 * Created by Administrator on 2017/8/15.
 */
@Data
public class TNotice implements Serializable {
    private Integer noticeId;//主键
    private Integer userId;//用户
    private Integer userIdByNotice;//被关注人的ID
}
