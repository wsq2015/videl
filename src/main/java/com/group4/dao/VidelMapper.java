package com.group4.dao;

import com.group4.bean.TVidel;
//import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15
 */
public interface VidelMapper extends JpaRepository<TVidel,Integer>{
    //没登录时候要的音频数据，
    @Modifying
    @Query(value = "select t_userid,t_videltitel,videlTitel,t_videltype,t_videltimelong,t_videlsendtime,t_videlplaytimes,t_videlpath,t_videlstatus,t_videlstatus from T_Videl",nativeQuery = true)
    List<TVidel> findTVidelsByUserId();
// 添加作品  1.音频id，2.作者id 3.音频标题 4.内容简介 5.标签 6.音频的时长 7.发布时间,8.播放数 (默认0)9.收藏数(默认0)10.评论数(默认0)11.举报次数(默认0)12.存放路径13.音频状态
    @Insert(value = "insert into TVidel(videlId,userId,videlTitel,videlInfo,videlType,videlTimeLong,videlSendTime,videlPlayTimes,videlPath,videlStatus) values(#{idelId},#{userId},#{videlTitel},#{videlInfo},#{videlType},#{videlTimeLong},#{videlSendTime},#{videlPlayTimes},#{videlPath},#{videlStatus}")
    void ConectionVidel(TVidel TVidel);
    //videlId,userId,videlTitel,videlInfo,videlType,videlTimeLong,videlSendTime,videlPlayTimes,videlPath,videlStatus

}
