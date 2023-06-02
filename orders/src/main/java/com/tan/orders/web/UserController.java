package com.tan.orders.web;

import com.tan.orders.config.R;
import com.tan.orders.entity.UserEntity;
import com.tan.orders.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public R<List<UserEntity>> getUsers() {
        List<UserEntity> users = userService.getUsers();
        return R.success(users);
    }

    @PostMapping("/register")
    public R<Boolean> register(@Validated @RequestBody UserEntity userEntity) {
        return R.success(userService.register(userEntity));
    }
}
