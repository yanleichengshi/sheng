package com.tan.orders.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tan.orders.entity.PersonEntity;
import com.tan.orders.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RefreshScope
public class PersonServiceImpl implements PersonService {
    @Value("${person.name}")
    private String personName;
    @Value("${person.age}")
    private Integer personAge;

    @Override
    public JSONObject getPersonInfo() {
        PersonEntity person = new PersonEntity();
        person.setName(personName);
        person.setAge(personAge);
        return JSONObject.parseObject(JSON.toJSONString(person));
    }
}
