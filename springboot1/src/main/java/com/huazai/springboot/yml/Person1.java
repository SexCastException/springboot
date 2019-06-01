package com.huazai.springboot.yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ConfigurationProperties和Value的区别：
 * 1.前者语法更松散，后者语法严格
 * 2.前者支持复杂类，集合和对象等，后者不支持
 * 3.前者不支持el表达式的一些用法，后者支持
 * 4.前者批量注入，后者单个注入
 * 5.前者支持JSR303数据校验，后者不支持
 *
 * 推荐使用前者
 * Created by pyh on 2019/5/29.
 */
@Component
public class Person1 {
    @Value("${person.last-name}_haha")
    private String lastName;

    @Value("${person.age}")
    private int age;

    private Map map;

    private List list;

    @Value("${person.birth}")
    private Date birth;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                ", birth=" + birth +
                ", dog=" + dog +
                '}';
    }
}
