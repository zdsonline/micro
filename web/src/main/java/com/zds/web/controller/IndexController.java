package com.zds.web.controller;

import com.alibaba.fastjson.JSON;
import com.zds.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangds
 * @Date 2019/2/9 22:41
 * @Description TODO
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public String index(){
//        return JSON.toJSONString(new User());//
        return JSON.toJSONString(userRepository.findAll());
    }
}
