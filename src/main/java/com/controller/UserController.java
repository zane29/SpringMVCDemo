package com.controller;

import com.controller.response.User;
import com.dao.CustomerDAO;
import com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 16:19
 */
//http://localhost:8080/user/zhouhaiming
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String name) {
        User user = new User();
        user.setName(name);
        user.setId(1100);
        return user;
    }
}
