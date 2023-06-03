package com.tan.ums.apifeign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "oms", path = "/oms")
public interface PersonApiService {

    @RequestMapping(value = "/user/getUsers", method = RequestMethod.GET)
    JSONObject getInfos();
}
