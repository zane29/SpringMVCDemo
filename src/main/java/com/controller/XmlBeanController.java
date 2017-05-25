package com.controller;

import com.controller.response.User;
import com.model.XmlBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhouhaiming on 2017-4-27 16:03
 * Email: dg_chow@163.com
 */
/*
* 返回xml格式
* 或者json格式
* */

//http://localhost:8080/xmlBeanController/zhouhaiming.xml
//    http://localhost:8080/xmlBeanController/zhouhaiming.json
@Controller
@RequestMapping(value = "/xmlBeanController")
public class XmlBeanController {
    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    @ResponseBody
    public XmlBean getUser(@PathVariable String name) {

        XmlBean xmlBean = new XmlBean();

        xmlBean.setName(name);
        xmlBean.setId(1);
        return xmlBean;
    }
}
