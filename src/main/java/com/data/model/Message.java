package com.data.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * Created by zhouhaiming on 2017-4-26 16:26
 * Email: dg_chow@163.com
 */
@Data
public class Message {
    private String name ;
    private String sex;
    @Range(max = 100 ,min = 0)
    private Integer age;

}
