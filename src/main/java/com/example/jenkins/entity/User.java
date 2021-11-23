package com.example.jenkins.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : guo yong
 * @Description :
 * @Date 2021-11-11 20:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer age;
    private String name;
    private String address;

}
