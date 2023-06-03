package com.tan.oms.service.impl;

import com.tan.oms.config.Cons;
import com.tan.oms.dao.UserDao;
import com.tan.oms.entity.UserEntity;
import com.tan.oms.service.UserService;
import com.tan.oms.utils.AESUtils;
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
