package com.huazai.springboot.annotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pyh on 2019/5/27.
 */
@Configuration
public class JavaConfigB {
    @Bean("BMW")
    public Car getBMWCar() {
        return new BMWCar();
    }
}
