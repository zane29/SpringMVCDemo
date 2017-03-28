package com.dao;

import com.model.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 13:40
 */
public interface CustomerDAO {
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);

}
