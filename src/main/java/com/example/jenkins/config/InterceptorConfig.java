package com.example.jenkins.config;

import com.example.jenkins.annotation.Ds;
import com.example.jenkins.aop.AnnotationAdvisor;
import com.example.jenkins.interceptor.TracingInterceptor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: InterceptorConfig
 * @author: 279000728@qq.com
 * @create: 2021-10-8 12:23
 **/
@Configuration
public class InterceptorConfig {

    public static final String traceExecution = "execution(* com.example.jenkins.service..*.*(..))";


    @Bean
    public AnnotationAdvisor defaultPointcutAdvisor2() {
        TracingInterceptor interceptor = new TracingInterceptor();
        //AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

         //Pointcut pointcut = new AnnotationMatchingPointcut(Ds.class,true);
        //pointcut.setExpression(traceExecution);

        // 配置增强类advisor
        AnnotationAdvisor advisor = new AnnotationAdvisor(interceptor);

        return advisor;
    }

}
