package com.example.demo.hello.web;

import com.example.demo.hello.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author lihuaju 2020-02-28
 * @version 1.0.1
 * @Description 学习搭建springboot测试自动化工程
 */

@RestController
public class HelloWorldController {
    @RequestMapping("/hello1")
    public String hello1(){
        return "Hello World";
    }
    @RequestMapping("/hello2")
    public List<String> hello2(){
        return Arrays.asList(new String[]{"A","B","C"});
    }

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String HelloWorld(){

        return this.helloWorldService.getHelloMessage();
    }
}
