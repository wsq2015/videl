package com.group4.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 音频表
 * Created by Administrator on 2017/8/15.
 */
@Data
@Entity
@Table(name = "t_videl")
public class TVidel implements Serializable {
    @Id
    @GeneratedValue
    private Integer videlId;//视频ID
    @Column(name = "t_userid")
    private Integer userId;//作者ID
    @Column(name = "t_videltitel")
    private String videlTitel;//视频标题
    @Column(name = "t_videlinfo")
    private String videlInfo;//视频介绍
    @Column(name = "t_videltype")
    private String videlType;//标签
    @Column(name = "t_videltimelong")
    private Date videlTimeLong;//视频时长
    @Column(name = "t_videlsendtime")
    private Date videlSendTime;//发布时间
    @Column(name = "t_videlplaytimes")
    private Integer videlPlayTimes;//播放次数
    @Column(name = "t_videlpath")
    private String videlPath;//存放路径
    @Column(name = "t_videlstatus")
    private Integer videlStatus;//视频状态

    public Integer getVidelId() {
        return videlId;
    }

    public void setVidelId(Integer videlId) {
        this.videlId = videlId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVidelTitel() {
        return videlTitel;
    }

    public void setVidelTitel(String videlTitel) {
        this.videlTitel = videlTitel;
    }

    public String getVidelInfo() {
        return videlInfo;
    }

    public void setVidelInfo(String videlInfo) {
        this.videlInfo = videlInfo;
    }

    public String getVidelType() {
        return videlType;
    }

    public void setVidelType(String videlType) {
        this.videlType = videlType;
    }

    public Date getVidelTimeLong() {
        return videlTimeLong;
    }

    public void setVidelTimeLong(Date videlTimeLong) {
        this.videlTimeLong = videlTimeLong;
    }

    public Date getVidelSendTime() {
        return videlSendTime;
    }

    public void setVidelSendTime(Date videlSendTime) {
        this.videlSendTime = videlSendTime;
    }

    public Integer getVidelPlayTimes() {
        return videlPlayTimes;
    }

    public void setVidelPlayTimes(Integer videlPlayTimes) {
        this.videlPlayTimes = videlPlayTimes;
    }

    public String getVidelPath() {
        return videlPath;
    }

    public void setVidelPath(String videlPath) {
        this.videlPath = videlPath;
    }

    public Integer getVidelStatus() {
        return videlStatus;
    }

    public void setVidelStatus(Integer videlStatus) {
        this.videlStatus = videlStatus;
    }
}
