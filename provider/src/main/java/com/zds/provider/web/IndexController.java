package com.zds.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangds
 * @Date 2019/2/11 22:47
 * @Description TODO
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam("name") String name){
        return "hi"+name+",receive your message!";
    }
}
