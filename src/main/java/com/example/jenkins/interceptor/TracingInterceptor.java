package com.example.jenkins.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @description: TracingInterceptor
 * @author: 279000728@qq.com
 * @create: 2021-10-8 11:53
 **/
public class TracingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("method "+methodInvocation.getMethod()+" is called on "+
                methodInvocation.getThis()+" with args "+methodInvocation.getArguments());
        return methodInvocation.proceed();
    }
}
