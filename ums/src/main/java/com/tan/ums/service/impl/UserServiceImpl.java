package com.tan.ums.service.impl;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.tan.common.cons.Cons;
import com.tan.common.cons.LogEnum;
import com.tan.common.cons.RedisCons;
import com.tan.common.exception.MyException;
import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.common.resp.ResultCode;
import com.tan.common.utils.*;
import com.tan.ums.apifeign.pojo.GoodsPojo;
import com.tan.ums.apifeign.service.GoodsApiService;
import com.tan.ums.dao.UserDao;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.UserQueryReq;
import com.tan.ums.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private GoodsApiService goodsApiService;

    @Resource
    private RedisUtils redisUtils;

    @Override
    public boolean add(UserEntity req) {
        // 校验phone唯一性
        if (checkPhone(req.getPhone())) {
            return false;
        }

        // 密码加密存储
        Long snowFlakeId = SnowFlakeUtil.getSnowFlakeId();
        req.setId(snowFlakeId);
        String encrypt = AESUtils.encrypt(req.getPwd(), Cons.PWD_SALT);
        req.setPwd(encrypt);

        return userDao.add(req);
    }

    private boolean checkPhone(String phone) {
        UserEntity userEntity = userDao.checkPhoneIsExit(phone);
        if (Objects.isNull(userEntity)) {
            return false;
        }
        log.error("{} system, the phone {} has exit", LogEnum.UMS_SYSTEEM, phone);
        return true;
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
            String token = UUIDUtils.getUuid();
            redisUtils.setEx(RedisCons.UMS_USER + "TOKEN:" + phone, token, 30, TimeUnit.MINUTES);
            return token;
        }
        return StringUtils.EMPTY;
    }

    @Override
    public List<UserEntity> query(UserQueryReq req) {
        return userDao.query(req);
    }

    @Override
    public UserEntity queryById(Long id) {
        UserEntity userEntity = userDao.queryById(id);
        if (Objects.isNull(userEntity)) {
            throw new MyException(ErrorEnum.UMS_USER_NOT_EXIT);
        }
        return userEntity;
    }

    /*goods*/
    @Override
    public GoodsPojo queryGoods(Long id) {
        R<GoodsPojo> result = goodsApiService.getInfos(id);
        if (!Objects.equals(result.getCode(), ResultCode.SUCCESS.getCode())) {
            throw new MyException(result.getMsg());
        }
        return result.getData();
    }
}
