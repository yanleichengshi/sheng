package com.tan.orders.service.impl;

import com.tan.orders.dao.UserDao;
import com.tan.orders.entity.UserEntity;
import com.tan.orders.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<UserEntity> getUsers() {
        return userDao.getUsers();
    }
}
