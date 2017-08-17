package com.group4.dao;

import com.group4.bean.TComment;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/8/15.
 */
@Mapper
public interface CommentMapper {
    //评论
    public void commentredio(TComment comment);
}
