package com.controller;

import com.controller.response.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhouhaiming on 2017-7-5 16:31
 * Email: dg_chow@163.com
 *
 * @Description:
 */
@Controller
@RequestMapping(value = "/session")
public class SessionController {
    @RequestMapping(value = "/createsession", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String CreateSession(HttpSession httpSession, HttpServletRequest req) {
        httpSession=req.getSession(false);
        httpSession.setAttribute("name","zhouhaiming");
        String session = "sessionID=" + httpSession.getId() + "\n创建了 name：zhouhaiming";
        return session;
    }

    @RequestMapping(value = "/getsession", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getSession(HttpSession httpSession, HttpServletRequest req) {
        httpSession=req.getSession(false);
        String session = "sessionID=" + httpSession.getId() + "\n获取 name：" + httpSession.getAttribute("name").toString();
        return session;
    }
}
