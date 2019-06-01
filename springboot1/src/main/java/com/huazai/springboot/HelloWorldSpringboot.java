package com.huazai.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by pyh on 2019/5/27.
 */

@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml"})
public class HelloWorldSpringboot {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringboot.class, args);
    }
}
