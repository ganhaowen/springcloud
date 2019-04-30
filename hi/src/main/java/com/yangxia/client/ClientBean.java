package com.yangxia.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@FeignClient(name = "hi-service",fallback =ClientBeanImpl.class )
public interface ClientBean {
    @RequestMapping("/hello/hello")
    public Map sayHello(@RequestParam(name = "name") String name);
}
