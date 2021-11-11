package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootJenkinsApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }

}
