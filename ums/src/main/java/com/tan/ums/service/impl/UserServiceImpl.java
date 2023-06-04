package com.tan.ums.service.impl;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.tan.common.cons.Cons;
import com.tan.common.cons.LogEnum;
import com.tan.common.cons.RedisCons;
import com.tan.common.utils.AESUtils;
import com.tan.common.utils.RedisUtils;
import com.tan.ums.dao.UserDao;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private RedisUtils redisUtils;

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
            return true;
        }
        log.error("{} system, the phone {} has exit", LogEnum.UMS_SYSTEEM, phone);
        return false;
    }

    @Override
    public String login(String phone, String pwd) {
        UserEntity userEntity = userDao.checkPhoneIsExit(phone);
        if (Objects.isNull(userEntity)) {
            log.error("{} system, the user is not exit", LogEnum.UMS_SYSTEEM);
            return StringUtils.EMPTY;
        }
        String encrypt = AESUtils.encrypt(pwd, Cons.PWD_SALT);
        if (StringUtils.equals(userEntity.getPwd(), encrypt)) {
            // 身份认证成功，生成token，写入redis，并且返回token
            String token = UUID.randomUUID().toString();
            redisUtils.setEx(RedisCons.UMS_USER_TOKEN, token, 30, TimeUnit.MINUTES);
            return token;
        }
        return StringUtils.EMPTY;
    }
}
