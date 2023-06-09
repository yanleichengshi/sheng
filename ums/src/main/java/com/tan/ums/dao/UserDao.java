package com.tan.ums.dao;

import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.UserQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 校验手机号是否重复
     * @param phone
     * @return
     */
    UserEntity checkPhoneIsExit(@Param("phone") String phone);

    /**
     * 新增用户
     * @param req
     * @return
     */
    boolean add(@Param("req") UserEntity req);

    List<UserEntity> query(@Param("req") UserQueryReq req);

    UserEntity queryById(@Param("id") Long id);
}
