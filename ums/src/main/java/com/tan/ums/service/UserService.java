package com.tan.ums.service;

import com.tan.ums.entity.UserEntity;

public interface UserService {
    boolean add(UserEntity req);

    String login(String phone, String pwd);
}
