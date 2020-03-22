package com.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 12:57
 */
@Data
@Entity
@Table(name = "tb_user")
@XmlRootElement(name = "xmlbean")
public class TbUser {

    @Id
    private Long id;
    @Column
    private Integer age;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private Boolean receivePaper;
    @Column
    private String gender;
    @Column
    private String favoriteNumber;
    @Column
    private String country;
}
