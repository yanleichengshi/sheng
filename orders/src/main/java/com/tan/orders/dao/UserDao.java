package com.tan.orders.dao;

import com.tan.orders.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<UserEntity> getUsers();
}
