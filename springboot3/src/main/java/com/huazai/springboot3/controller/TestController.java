package com.huazai.springboot3.controller;

import com.huazai.springboot3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by pyh on 2019/5/31.
 */
@Controller
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("hello1")
    public Person hello1(Date birth) {
        Person person = new Person("pyh", 23, birth);
        System.out.println(person);
        return person;
    }
}
