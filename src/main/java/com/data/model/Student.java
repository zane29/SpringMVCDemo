package com.data.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 12:57
 */
@Data
public class Student {
    private Integer age;
    private String name;
    private Integer id;
    private String address;
    private boolean receivePaper;
    private String [] favoriteFrameworks;
    private String gender;
    private String favoriteNumber;
    private String country;
    private String [] skills;


}
