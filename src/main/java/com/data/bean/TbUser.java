package com.data.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 16:19
 */

@Data
@Entity
@Table(name = "tb_user")
public class TbUser {
    @Id
    private Long id;

    private String name;

}
