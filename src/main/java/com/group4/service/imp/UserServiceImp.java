package com.group4.service.imp;

import com.group4.bean.TUser;
import com.group4.dao.UserMapper;
import com.group4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(TUser user) {
        user.setSignTime(new Date());
        user.setSole(0);
        user.setHeadImage("default");
        user.setUserStatus(0);
        userMapper.register(user);
    }

    @Override
    public TUser queryByName(TUser user) {
        return userMapper.queryByName(user);
    }

    @Override
    public TUser login(TUser user) {
        return  userMapper.login(user);
    }

    @Override
    public List<TUser> queryTuserAndVidel() {
        return userMapper.queryTuserAndVidel();
    }
}
