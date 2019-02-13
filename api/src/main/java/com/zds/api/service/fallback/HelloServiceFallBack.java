package com.zds.api.service.fallback;

import com.zds.api.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author zhangds
 * @Date 2019/2/13 11:13
 * @Description TODO
 **/
@Component
public class HelloServiceFallBack implements HelloService {

    @Override
    public String greeting(String name) {
        return " sorry, your request is fail,thank you "+name+" for your request!";
    }
}
