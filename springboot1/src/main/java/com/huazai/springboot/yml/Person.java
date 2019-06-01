package com.huazai.springboot.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by pyh on 2019/5/29.
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    @Email
    private String email;
    private String lastName;
    private int age;
    private Map map;
    private List list;
    private Date birth;
    private Dog dog;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
        return "Person{" +
                "email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                ", birth=" + birth +
                ", dog=" + dog +
                '}';
    }
}
