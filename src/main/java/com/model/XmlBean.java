package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhouhaiming on 2017-4-27 16:02
 * Email: dg_chow@163.com
 */

/*
*
* 返回xml格式*/
@XmlRootElement(name = "xmlbean")
public class XmlBean {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
}
