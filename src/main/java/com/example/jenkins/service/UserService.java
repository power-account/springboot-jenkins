package com.example.jenkins.service;

import com.example.jenkins.annotation.Ds;
import com.example.jenkins.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: UserService
 * @author: 279000728@qq.com
 * @create: 2021-10-6 14:02
 **/
@Service
@Ds("123")
public class UserService implements InitializingBean {



    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Value("${server.port}")
    private String value;

    public UserService(){
        System.out.println("1");
    }


    public String getStr(){
       return  userDao.getStr();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(value);

    }
}
