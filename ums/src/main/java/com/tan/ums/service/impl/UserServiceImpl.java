package com.tan.ums.service.impl;

import com.tan.common.cons.Cons;
import com.tan.common.cons.LogEnum;
import com.tan.common.utils.AESUtils;
import com.tan.ums.dao.UserDao;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public boolean add(UserEntity req) {
        // 校验phone唯一性
        if (checkPhone(req.getPhone())) {
            return false;
        }

        // 密码加密存储
        String encrypt = AESUtils.encrypt(req.getPwd(), Cons.PWD_SALT);
        req.setPwd(encrypt);

        req.setDelFlag("1");
        return userDao.add(req);
    }

    private boolean checkPhone(String phone) {
        UserEntity userEntity = userDao.checkPhoneIsExit(phone);
        if (Objects.nonNull(userEntity)) {
            log.info("{} system, the phone {} has exit", LogEnum.UMS_SYSTEEM, phone);
            return true;
        }
        return false;
    }
}
