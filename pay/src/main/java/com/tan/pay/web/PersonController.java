package com.tan.pay.web;

import com.alibaba.fastjson.JSONObject;
import com.tan.pay.apifeign.PersonApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class PersonController {
    @Autowired
    private PersonApiService personApiService;

    @GetMapping("/getInfos")
    public JSONObject getInfos() {
        return personApiService.getInfos();
    }
}
