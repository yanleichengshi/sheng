package com.tan.ums.service;

import com.tan.ums.entity.UserDomain;

public interface UserService {
    boolean add(UserDomain req);

    String login(String phone, String pwd);
}
