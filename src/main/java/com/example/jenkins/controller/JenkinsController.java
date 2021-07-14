package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: JenkinsCongroller
 * @author: 279000728@qq.com
 * @create: 2021-7-13 16:10
 **/

@RestController
public class JenkinsController {


    @GetMapping("/hello")
    public String sayHello(String ms )

    {
        return "hello,world,jenkins" +ms;

    }


}
