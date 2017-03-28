package com.dao.impl;

import com.dao.CustomerDAO;
import com.model.Customer;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 15:06
 */

/**
 * JdbcDaoSupport实例
 *
 * 通过扩展 JdbcDaoSupport，设置数据源，并且 JdbcTemplate 在你的类中不再是必需的，只需要正确的数据源注入JdbcCustomerDAO。
 * 可以使用 getJdbcTemplate()方法得到 JdbcTemplate。
 * */


public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {
    @Override
    //no need to set datasource here
    public void insert(Customer customer) {

        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql, new Object[]{customer.getCustId(),
                customer.getName(), customer.getAge()
        });
    }

    @Override
    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
        Customer customer = null;
        List<Map<String, Object>> mapList =getJdbcTemplate().queryForList(sql,custId );
        Map map = mapList.get(0);
        customer = new Customer();
        customer.setAge(Integer.valueOf(map.get("Age").toString()));
        customer.setName((String) map.get("NAME"));
        customer.setCustId(Integer.valueOf(map.get("CUST_ID").toString()));

        return customer;
    }
}
