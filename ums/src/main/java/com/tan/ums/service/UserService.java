package com.tan.ums.service;

import com.tan.ums.apifeign.pojo.GoodsPojo;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.UserQueryReq;

import java.util.List;

public interface UserService {
    boolean add(UserEntity req);

    String login(String phone, String pwd);

    List<UserEntity> query(UserQueryReq req);

    UserEntity queryById(Long id);

    /*goods*/
    GoodsPojo queryGoods(Long id);
}
