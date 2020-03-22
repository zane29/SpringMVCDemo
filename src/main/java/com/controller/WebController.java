package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 13:07
 */

/**
* 重定向到静态资源
* */
@Controller
@RequestMapping(value = "/HelloWeb")
public class WebController {
    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        //页面重定向
        return "redirect:/static/Snipaste.png";
    }
}
