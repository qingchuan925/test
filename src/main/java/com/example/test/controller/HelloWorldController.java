package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lyk
 * @Date: 2019/1/17 12:04
 * @Description:
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
    	//C测试
        return "hello world;";
    }
}
