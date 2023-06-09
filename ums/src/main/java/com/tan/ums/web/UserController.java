package com.tan.ums.web;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.ums.apifeign.pojo.GoodsPojo;
import com.tan.ums.entity.UserEntity;
import com.tan.ums.req.UserAddReq;
import com.tan.ums.req.UserQueryReq;
import com.tan.ums.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public R add(@RequestBody @Valid UserAddReq req) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(req, userEntity);
        if (userService.add(userEntity)) {
            return R.success();
        }
        return R.fail(ErrorEnum.ADD_FAIL.getMsg());
    }

    @PostMapping("login")
    public R<String> login(@RequestParam String phone, @RequestParam String pwd) {
        String token = userService.login(phone, pwd);
        if (StringUtils.isNotBlank(token)) {
            return R.success(token);
        }
        return R.fail(ErrorEnum.LOGIN_FAIL.getMsg());
    }

    @PostMapping("/query")
    public R<List<UserEntity>> query(@RequestBody UserQueryReq req) {
        return R.success(userService.query(req));
    }

    @GetMapping("/queryById")
    public R<UserEntity> queryById(@RequestParam Long id) {
        return R.success(userService.queryById(id));
    }

    /*goods*/
    @GetMapping("/queryGoods")
    public R<GoodsPojo> queryGoods(@RequestParam Long id) {
        return R.success(userService.queryGoods(id));
    }

}
