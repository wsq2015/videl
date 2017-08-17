package com.group4.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 站内信表
 * Created by Administrator on 2017/8/15.
 */
@Data
public class TMessage implements Serializable {
    private Integer messageId;//主键
    private Integer sendUserId;//发信人
    private Integer recUserId;//收信人
    private String messageTitle;//信标题
    private String messageInfo;//信内容
    private Integer messageStatus;//信息状态
    private Date messageSendTime;//发送时间
}
