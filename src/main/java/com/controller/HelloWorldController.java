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
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/24
 * Time: 9:13
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "hello/index";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        //页面重定向
        return "redirect:/static/image/Snipaste.png";
    }

    /**
     * http://localhost:8080/hello
     * */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)//
    public String Hello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "国迈");
        return "hello/hello";
    }

    /**
     * 对于ModelAndView构造函数可以指定返回页面的名称
     * http://localhost:8080/hello1
     */
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("hello/hello");
        modelAndView.addObject("name", "周海明");
        return modelAndView;
    }

    /**
     * 可以通过setViewName方法来设置所需要跳转的页面
     * <p>
     * http://localhost:8080/hello2
     */

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public ModelAndView hello2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "国迈");
        modelAndView.addObject("msg", "我是hello2跳转过来的");
        modelAndView.setViewName("hello/hello");
        return modelAndView;
    }

    /**
     * 在Servlet中，我们是可以直接forward或者redirecit到html页面，所以我们也可以如下在springmvc中返回到html页面
     * http://localhost:8080/hello3
     */

    @RequestMapping(value = "/hello3")
    public void htmlView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("hello2").forward(request, response);
//        response.sendRedirect("http://www.baidu.com");
    }

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> hello3() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "周海明");
        map.put("num", "00001");
        return map;
    }

    /**
     * Servlet直接将HTML的字符流输出到了浏览器端，那么在SpringMVC中该如何做呢？其实在SpringMVC中我们也是可以如下实现的：
     */
    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    public void getcustomer(Reader reader, Writer writer, HttpSession session) throws IOException {
        StringBuffer html = new StringBuffer();
        html.append("<!doctype html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        html.append("<title>支付宝即时到账交易接口</title></head><body>" + "123456" + "</body></html>");
        writer.write(html.toString());
    }

    /**
     * 指定返回的视图页面名称，结合设置的返回地址路径加上页面名称后缀即可访问到。
     * 注意：如果方法声明了注解@ResponseBody ，则会直接将返回值输出到页面。
     */

    @RequestMapping(value = "/hello6", method = RequestMethod.GET)
    @ResponseBody
    public String getcustomer2() {
        StringBuffer html = new StringBuffer();
        html.append("<!doctype html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        html.append("<title>支付宝即时到账交易接口</title></head><body>" + "123456" + "</body></html>");
        return html.toString();
    }



    @RequestMapping(value = "/createSession", method = RequestMethod.GET)
    @ResponseBody
    public String CreateSession(HttpSession httpSession, HttpServletRequest req) {
        httpSession=req.getSession(false);
        httpSession.setAttribute("name","zhouhaiming");
        String session = "sessionID=" + httpSession.getId() + "\n创建了 name：zhouhaiming";
        return session;
    }

    @RequestMapping(value = "/getSession", method = RequestMethod.GET)
    @ResponseBody
    public String getSession(HttpSession httpSession, HttpServletRequest req) {
        httpSession=req.getSession(false);
        String session = "sessionID=" + httpSession.getId() + "\n获取 name：" + httpSession.getAttribute("name").toString();
        return session;
    }
}
