package com.group4.service.imp;

import com.group4.bean.TCollection;
import com.group4.dao.CollectionMapper;
import com.group4.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service

public class CollectionServiceImp implements CollectionService{
    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public void collectionredio(TCollection collection) {
        collectionMapper.collectionredio(collection);
    }
}
