package com.tan.ums.web;

import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.AddUserReq;
import com.tan.ums.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public R add(@RequestBody @Valid AddUserReq req) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(req, userEntity);
        if (userService.add(userEntity)) {
            return R.success();
        }
        return R.fail(ErrorEnum.ADD_FAIL.getMsg());
    }

}
