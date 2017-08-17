package com.group4.dao;

import com.group4.bean.TCollection;
import javafx.print.Collation;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/8/15.
 */
@Mapper
public interface CollectionMapper {
    //收藏
    public void collectionredio(TCollection collection);

}
