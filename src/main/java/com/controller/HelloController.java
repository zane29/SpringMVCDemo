package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/24
 * Time: 9:13
 */
@Controller
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)//    http://localhost:8080/
    public String Hello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "国迈");
        return "hello";
    }

    /*对于ModelAndView构造函数可以指定返回页面的名称*/
    @RequestMapping(value = "/index1", method = RequestMethod.GET)//http://localhost:8080/index1
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/hello");
        modelAndView.addObject("name", "周海明");
        return modelAndView;
    }

    /*可以通过setViewName方法来设置所需要跳转的页面*/
    //http://localhost:8080/index2
    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "国迈");
        modelAndView.addObject("msg", "我是index2跳转过来的");
        modelAndView.setViewName("/hello");
        return modelAndView;
    }

    /*在Servlet中，我们是可以直接forward或者redirecit到html页面，所以我们也可以如下在springmvc中返回到html页面*/
    //http://localhost:8080/htmlView
    @RequestMapping(value = "/htmlView")
    public void htmlView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index2").forward(request, response);
//        response.sendRedirect("http://www.baidu.com");
    }

    @RequestMapping(value = "/index3", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Map<String, String> index3() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "周海明");
        map.put("num", "00001");//map.put相当于request.setAttribute方法
        return map;
    }

    // Servlet直接将HTML的字符流输出到了浏览器端，那么在SpringMVC中该如何做呢？其实在SpringMVC中我们也是可以如下实现的：
    @RequestMapping(value = "/index4", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public void getcustomer(Reader reader, Writer writer, HttpSession session) throws IOException {
        StringBuffer sbHtml = new StringBuffer();
        sbHtml.append("<!doctype html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        sbHtml.append("<title>支付宝即时到账交易接口</title></head><body>" + "123456" + "</body></html>");
        writer.write(sbHtml.toString());
    }
/*
     * String
     * 指定返回的视图页面名称，结合设置的返回地址路径加上页面名称后缀即可访问到。
     * 注意：如果方法声明了注解@ResponseBody ，则会直接将返回值输出到页面。
    */

    @RequestMapping(value = "/index5", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getcustomer2() throws IOException {
        StringBuffer sbHtml = new StringBuffer();
        sbHtml.append("<!doctype html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        sbHtml.append("<title>支付宝即时到账交易接口</title></head><body>" + "123456" + "</body></html>");
        return sbHtml.toString();
    }
}
