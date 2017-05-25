package com.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

/**
 * Created by zhouhaiming on 2017-4-26 16:26
 * Email: dg_chow@163.com
 */

public class Message {
    @NotEmpty
    public String name ;
    public String sex;
    @Range(max = 100 ,min = 0)
    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
