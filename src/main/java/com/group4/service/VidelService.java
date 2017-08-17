package com.group4.service;

import com.group4.bean.TVidel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service
public interface VidelService {
    // 没登录时候要的音频数据，
    public List<TVidel> queryTVidelsByUserId();
    // 添加作品  1.音频id，2.作者id 3.音频标题 4.内容简介 5.标签 6.音频的时长
    // 7.发布时间,8.播放数 (默认0)9.收藏数(默认0)10.评论数(默认0)11.举报次数(默认0)12.存放路径13.音频状态
    void ConectionVidel(TVidel TVidel);
}
