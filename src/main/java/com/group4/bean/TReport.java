package com.group4.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 举报表
 * Created by Administrator on 2017/8/15.
 */
@Data
@Entity
@Table(name = "t_report")
public class TReport implements Serializable {
    @Id
    @GeneratedValue
    private Integer reportId;//主键
    @Column(name = "t_videlId")
    private Integer videlId;//举报的视频
    @Column(name = "t_userId")
    private Integer userId;//举报的用户
    @Column(name = "t_reportInfo")
    private String reportInfo;//举报内日
    @Column(name = "t_reportTime")
    private Date reportTime;//举报时间


}
