package com.controller;

import com.data.bean.TbUser;
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

/**
 * Get请求进来带参数，返回json字符串
 */
@Controller
@RequestMapping("/user")

public class UserController {

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    @ResponseBody
    public TbUser getUser(@PathVariable String name) {
        TbUser tbUser = new TbUser();
        tbUser.setName(name);
        tbUser.setId(1100L);
        return tbUser;
    }
}
