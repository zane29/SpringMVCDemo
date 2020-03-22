package com.dao;

import com.data.bean.TbCustomer;
import org.springframework.stereotype.Repository;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 13:40
 */
@Repository
public interface TbCustomerRepository extends BaseDao<TbCustomer, Integer> {


    TbCustomer findById(Long custId);

}
