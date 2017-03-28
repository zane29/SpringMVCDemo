package com.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 13:40
 */
@Component
public class Customer {

    int custId;
    @NotEmpty
    String name;
    @Max(20)
    int age;

    public Customer() {

    }

    public Customer(int custId, String name, int age) {
        this.custId = custId;
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "custId:" + custId + "\tname:" + name + "\tage:" + age;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
