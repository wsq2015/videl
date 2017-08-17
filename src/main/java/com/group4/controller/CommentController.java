package com.group4.controller;

import com.group4.bean.TComment;
import com.group4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alone on 2017/8/17.
 * 评论
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @RequestMapping("/comment")
    public String comment(TComment comment){

        commentService.commentredio(comment);
        return "query";

    }

}
