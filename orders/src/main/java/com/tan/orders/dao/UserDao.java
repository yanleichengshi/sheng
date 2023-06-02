package com.tan.orders.dao;

import com.tan.orders.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户dao
 */
@Mapper
public interface UserDao {
    List<UserEntity> getUsers();

    Boolean register(UserEntity userEntity);
}
