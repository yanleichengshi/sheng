package com.tan.ums.web;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.AddUserReq;
import com.tan.ums.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

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

    @PostMapping("del")
    public R del(String id) {
        return R.success();
    }

    @PostMapping("login")
    public R<String> login(@RequestParam String phone, @RequestParam String pwd) {
        String token = userService.login(phone, pwd);
        if (StringUtils.isNotBlank(token)) {
            return R.success(token);
        }
        return R.fail(ErrorEnum.LOGIN_FAIL.getMsg());
    }

}
