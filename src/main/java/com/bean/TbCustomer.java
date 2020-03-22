package com.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 13:40
 */
@Data
@Entity
@Table(name = "tb_customer")
public class TbCustomer {

    @Id
    private Long id;

    private String name;

    private Integer age;

}
