package com.tan.orders.web;

import com.alibaba.fastjson.JSONObject;
import com.tan.orders.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("getPersonInfo")
    public JSONObject getPersonInfo() {
        return personService.getPersonInfo();
    }
}
