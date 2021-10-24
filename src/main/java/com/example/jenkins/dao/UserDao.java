package com.example.jenkins.dao;

import org.springframework.stereotype.Repository;

/**
 * @description: UserDao
 * @author: 279000728@qq.com
 * @create: 2021-10-6 14:03
 **/
@Repository
public class UserDao {

    private static ThreadLocal<String> str =new ThreadLocal<>();

    public  String getStr(){
        return "1";

    }

    public static void main(String[] args) {
        str.set("123");
    }

}
