package com.tan.oms.service;

import com.tan.oms.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getUsers();

    Boolean register(UserEntity userEntity);
}
