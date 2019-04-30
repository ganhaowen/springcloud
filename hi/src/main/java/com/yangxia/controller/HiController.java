package com.yangxia.controller;

import com.yangxia.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/5.
 */
@RestController
@RequestMapping("/hi")
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping("/hi")
    public Map hi(String name) {
        System.out.println(name);
        return hiService.hi(name);
    }
}
