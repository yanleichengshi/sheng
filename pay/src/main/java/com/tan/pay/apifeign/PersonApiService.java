package com.tan.pay.apifeign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orders", path = "/orders")
public interface PersonApiService {

    @RequestMapping(value = "/person/getPersonInfo", method = RequestMethod.GET)
    JSONObject getInfos();
}
