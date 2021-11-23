package com.example.jenkins.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ThreadLocalTest
 * @author: 279000728@qq.com
 * @create: 2021-10-8 19:01
 **/
public class ThreadLocalTest {

    private static ThreadLocal<List<String>> threadLocal = new ThreadLocal<List<String>>(){
        @Override
        protected List<String> initialValue(){
            return  new ArrayList<String>();
        }
    };

    public void setThreadLocal(List<String> value) {

        threadLocal.set(value);
        System.out.println(Thread.currentThread().getName());
    }

    public void getThreadLocal() {
        threadLocal.get().forEach(name -> System.out.println(Thread.currentThread().getName()+"###" + name ));
    }


    public static void main(String[] args) {

        final ThreadLocalTest test = new ThreadLocalTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> strs = new ArrayList<String>();
                strs.add("1");
                strs.add("2");
                strs.add("3");
                test.setThreadLocal(strs);
                List<String> strs2 = new ArrayList<String>();
                strs2.add("4");
                strs2.add("5");
                strs2.add("6");
                test.setThreadLocal(strs2);
                test.getThreadLocal();
            }
        },"t1").start();

        /*new Thread(new Runnable() {

            @Override
            public void run() {
                List<String> strs = new ArrayList<String>();
                strs.add("a");
                strs.add("b");
                System.out.println(Thread.currentThread().getName());
                test.setThreadLocal(strs);
                test.getThreadLocal();
            }
        },"t2").start();*/
    }

}