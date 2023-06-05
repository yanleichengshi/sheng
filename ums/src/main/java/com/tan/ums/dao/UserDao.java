package com.tan.ums.dao;

import com.tan.ums.entity.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    /**
     * 校验手机号是否重复
     * @param phone
     * @return
     */
    UserDomain checkPhoneIsExit(@Param("phone") String phone);

    /**
     * 新增用户
     * @param req
     * @return
     */
    boolean add(@Param("req") UserDomain req);
}
