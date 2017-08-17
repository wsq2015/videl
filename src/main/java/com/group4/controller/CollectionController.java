package com.group4.controller;

import com.group4.bean.TCollection;
import com.group4.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alone on 2017/8/17.
 */
@Controller
public class CollectionController {
      @Autowired
    private CollectionService collectionService;
      @RequestMapping("/collection")
    public String collectionredio(TCollection collection){

          collectionService.collectionredio(collection);
          return "query";
      }

}
