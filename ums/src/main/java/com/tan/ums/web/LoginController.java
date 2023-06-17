package com.tan.ums.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "index";
    }

    @GetMapping("/getVerifyCode")
    public @ResponseBody String getVerifyCode() {
        return "1234";
    }
}
