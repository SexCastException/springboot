package com.huazai.springboot;

import com.huazai.springboot.yml.Person;
import com.huazai.springboot.yml.Person1;
import com.huazai.springboot.yml.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pyh on 2019/5/27.
 */
@Controller
/*@ImportResource(locations = {"classpath:bean.xml"})*/
public class TestController {

    @Autowired
    private Person person;
    @Autowired
    private Person1 person1;
    @Autowired
    private Person2 person2;
    /*@Autowired
    private Person3 person3;*/
    @Autowired
    ApplicationContext context;


    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        return "helloTesaaa";
    }

    @ResponseBody
    @RequestMapping("test1")
    public String test1() {
        System.out.println(context.getBean("person3"));
        return "test1";
    }
}
