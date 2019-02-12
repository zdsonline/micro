package com.zds.web.controller;

import com.zds.api.service.HelloService;
import com.zds.dao.ArticleRepository;
import com.zds.dao.UserRepository;
import com.zds.entity.Article;
import com.zds.web.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    HelloService helloService;

    @GetMapping("")
    public APIResponse index() {
//        return JSON.toJSONString(new User());//

        List<Article> articles = articleRepository.findAll();
        return APIResponse.success(articles);
    }

    @GetMapping("/greeting")
    public APIResponse greeting(){
//        helloService.greeting("");
        return APIResponse.success(helloService.greeting("我是奔波儿灞~~"));
    }
}
