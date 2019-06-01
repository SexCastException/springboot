package com.huazai.springboot.annotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pyh on 2019/5/27.
 */
@Configuration
public class JavaConfigA {

    @Bean("toyota")
    public Car getToyotaCar() {
        return new ToyotaCar();
    }
}
