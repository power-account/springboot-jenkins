package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(value = {"com.example.jenkins.config"})
public class SpringbootJenkinsApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootJenkinsApplication.class, args);
		 SpringApplication.run(SpringbootJenkinsApplication.class, args);
		  SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }

}
