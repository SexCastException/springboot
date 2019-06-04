package com.huazai.springboot3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by pyh on 2019/6/4.
 */
@Configuration
public class TestConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new Formatter<Date>() {
            @Override
            public String print(Date object, Locale locale) {
                return null;
            }

            @Override
            public Date parse(String text, Locale locale) throws ParseException {
                return new SimpleDateFormat("yyyy-MM-dd").parse(text);
            }
        });
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("form.html").setViewName("form");
    }
}
