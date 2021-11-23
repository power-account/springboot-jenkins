package com.example.jenkins.controller;

import com.example.jenkins.config.DynamicDataSourceProperties;
import com.example.jenkins.entity.User;
import com.example.jenkins.service.AsyncService;
import com.example.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: JenkinsCongroller
 * @author: 279000728@qq.com
 * @create: 2021-7-13 16:10
 **/

@RestController
@Configuration
@ConfigurationProperties(prefix = "aa")
@EnableConfigurationProperties
public class JenkinsController {

    @Autowired
    DynamicDataSourceProperties dynamicDataSourceProperties;

    @Autowired
    UserService userService;

    @Autowired
    AsyncService asyncService;



    @GetMapping("/submit2")
    public String getUser(@Validated @RequestParam @NotBlank(message = "账号不能为空")  String userId )

    {

        return userId;

    }


    @GetMapping("/submit")
    public String addUser(@Valid @RequestBody User user)

    {

        return user.toString();

    }

    @GetMapping("/hello")
    public String sayHello(String ms )

    {
        return "hello,world,jenkins" +ms;

    }


    @GetMapping("/ds")
    public String getDs()
    {

        return userService.getStr();

    }


}
