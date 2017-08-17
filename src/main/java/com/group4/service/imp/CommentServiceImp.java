package com.group4.service.imp;

import com.group4.bean.TComment;
import com.group4.dao.CommentMapper;
import com.group4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service

public class CommentServiceImp implements CommentService{
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void commentredio(TComment comment) {
        commentMapper.commentredio(comment);
    }
}
