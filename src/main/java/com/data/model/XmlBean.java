package com.data.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhouhaiming on 2017-4-27 16:02
 * Email: dg_chow@163.com
 */

/*
*
* 返回xml格式*/
@Data
@XmlRootElement(name = "xmlbean")
public class XmlBean {
    private String name;
    private int id;

}
