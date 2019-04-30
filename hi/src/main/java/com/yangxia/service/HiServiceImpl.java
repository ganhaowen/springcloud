package com.yangxia.service;

import com.yangxia.client.ClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/6.
 */
@Service
public class HiServiceImpl implements HiService {
    @Autowired
    ClientBean clientBean;

    @Override
    public Map hi(String name) {
        System.out.println(123);
        return clientBean.sayHello(name);
    }
    /*@Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "aa")
    @Override
    public String hi(String name) {
        String s = restTemplate.getForObject("http://HI-SERVICE/hello/hello?name=" + name, String.class);
        return s;
    }


    public String aa(String name){
        return "hi,"+name+",sorry,error!";
    }*/

}
