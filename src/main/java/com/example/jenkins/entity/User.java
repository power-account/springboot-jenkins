package com.example.jenkins.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.Optional;

/**
 * @description: User
 * @author: 279000728@qq.com
 * @create: 2021-10-24 11:07
 **/
@Data
@ToString
public class User {

    @NotBlank
    private String name;

    @Min(value = 1)
    @Max(value = 100,message ="年龄不能超过{value}岁")
    private Integer age;

    private String address;

    private String code;

    private String email;

    @NotBlank
    @Pattern(regexp = "^(1[3-9][0-9])\\d{8}$", message = "手机号格式不正确")
    private String phone;

    public Optional<String> getCode(){
        return Optional.ofNullable(code);
    }

}
