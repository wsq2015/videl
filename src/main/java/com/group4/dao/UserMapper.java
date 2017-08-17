package com.group4.dao;

import com.group4.bean.TUser;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
@Mapper
public interface UserMapper {
    //注册
    @Insert("INSERT INTO T_USER (t_username,t_password,t_email,t_headimage,t_signtime,t_sole,t_status) VALUE (#{userName},#{password},#{email},#{headImage},#{signTime},#{sole},#{userStatus})")
     void register(TUser user);

    //ajax验证用户名是否重复
    @Select("SELECT * FROM T_USER WHERE t_username=#{userName}")
    @Results(value = {
            @Result(column = "t_username",property = "userName"),
    }
    )
    TUser queryByName(TUser user);

    //登录
    @Select("SELECT * FROM T_USER WHERE t_username=#{userName} and t_password=#{password}")
    @Results(value = {
            @Result(column = "t_username",property = "userName"),
            @Result(column ="t_password" ,property = "password"),
    }
    )
    TUser login(TUser user);
    //查询登录用户的音频列表,可筛选出想要的数据
    @Select("SELECT * FROM T_USER as tu,T_Videl as tv where tv.t_userId = tu.t_userid")
    List<TUser> queryTuserAndVidel();



}
