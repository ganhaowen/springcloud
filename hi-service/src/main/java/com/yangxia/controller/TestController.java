package com.yangxia.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/5.
 */
@RestController
@RequestMapping("/hello")
public class TestController {


    @RequestMapping("/hello")
    public Map sayHello(@RequestBody String name) {
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(name);
        map.put("hello",name);


        return map;

    }
}
