package com.tan.oms.service;

import com.tan.oms.apifeign.pojo.UserPojo;
import com.tan.oms.entity.GoodsEntity;

public interface GoodService {

    boolean add(GoodsEntity goodsEntity);

    GoodsEntity queryById(Long id);

    /*user*/
    UserPojo queryUser(Long id);
}
