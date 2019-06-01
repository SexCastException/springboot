package com.huazai.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pyh on 2019/5/31.
 */
@Controller
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
