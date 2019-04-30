package com.yangxia.client;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ClientBeanImpl implements ClientBean {
    @Override
    public Map sayHello(String name) {
        HashMap map = new HashMap();
        map.put("123","abc");
        return map;
    }
}
