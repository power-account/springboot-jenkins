package com.example.jenkins.annotation;


import java.lang.annotation.*;

/**
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ds {

    String value();
}
