package com.group4.controller;

import com.group4.bean.TVidel;
import com.group4.service.VidelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
public class VidelController {
    @Autowired
    private VidelService videlService;
    // 没登录时候要的音频数据，
    @RequestMapping("queryTVidelsByUserId")
    @ResponseBody
    public List<TVidel> queryTVidelsByUserId() {
        return videlService.queryTVidelsByUserId();
    }

    // 添加作品  1.音频id，2.作者id 3.音频标题 4.内容简介 5.标签 6.音频的时长
    // 7.发布时间,8.播放数 (默认0)9.存放路径10.音频状态
    @RequestMapping("ConectionVidel")
    public void ConectionVidel(TVidel TVidel) {
        TVidel.setVidelPlayTimes(0);
        videlService.ConectionVidel(TVidel);
    }




}

