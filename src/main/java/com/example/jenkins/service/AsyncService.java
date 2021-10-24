package com.example.jenkins.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: AsyncService
 * @author: 279000728@qq.com
 * @create: 2021-10-8 14:56
 **/
@Service
public class AsyncService {

    public void async1() {
        System.out.println("1:" + Thread.currentThread().getName());
        this.async2();
    }

    @Async
    public void async2() {
        System.out.println("2:" + Thread.currentThread().getName());
    }
}
