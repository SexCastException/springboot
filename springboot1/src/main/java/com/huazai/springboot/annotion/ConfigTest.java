package com.huazai.springboot.annotion;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by pyh on 2019/5/27.
 */
public class ConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ParentConfig.class);
        Car bmw = (Car) configApplicationContext.getBean("BMW");
        bmw.printInfo();
        Car toyota = (Car) configApplicationContext.getBean("toyota");
        toyota.printInfo();
    }

}
