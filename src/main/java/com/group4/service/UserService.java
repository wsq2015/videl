package com.group4.service;

import com.group4.bean.TUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
public interface UserService {
    //注册
    void register(TUser user);

    //ajax验证用户名是否重复
    TUser queryByName(TUser user);


    //登录
    TUser login(TUser user);
    //查询登录用户的音频列表
    List<TUser> queryTuserAndVidel();
}
