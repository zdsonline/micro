package com.zds.api.service;


import com.zds.api.service.fallback.HelloServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider-test1", fallback = HelloServiceFallBack.class)
public interface HelloService {
    /**
     * @param name
     */
    @GetMapping(value = "/index/greeting")
    String greeting(@RequestParam(value = "name") String name);
}