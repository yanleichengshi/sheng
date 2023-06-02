package com.tan.orders.service.impl;

import com.tan.orders.config.Cons;
import com.tan.orders.dao.UserDao;
import com.tan.orders.entity.UserEntity;
import com.tan.orders.service.UserService;
import com.tan.orders.utils.AESUtils;
import lombok.NonNull;
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

    @Override
    public Boolean register(UserEntity userEntity) {
        String oldPwd = userEntity.getPwd();
        String newPwd = AESUtils.encrypt(oldPwd, Cons.PWD_SALT);
        userEntity.setPwd(newPwd);
        Boolean flag = userDao.register(userEntity);
        return flag;
    }
}
