package com.controller;

import com.bean.TbUser;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/27
 * Time: 12:58
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @RequestMapping(value = "/json/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public TbUser getUser(@PathVariable String name) {
        TbUser tbUser = new TbUser();
        tbUser.setName(name);
        return tbUser;
    }

    @RequestMapping(value = "/xml/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public TbUser getXmlUser(@PathVariable String name) {
        TbUser userXmlResponse = new TbUser();
        userXmlResponse.setName(name);
        return userXmlResponse;
    }

    //http://localhost:8080/formHandling/student
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("user/userAdd", "command", new TbUser());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") TbUser tbUser, ModelMap model) {
        model.addAttribute("name", tbUser.getName());
        model.addAttribute("age", tbUser.getAge());
        model.addAttribute("id", tbUser.getId());
        model.addAttribute("receivePaper", tbUser.getReceivePaper());
        model.addAttribute("gender", tbUser.getGender());
        model.addAttribute("favoriteNumber", tbUser.getFavoriteNumber());
        model.addAttribute("address", tbUser.getAddress());
        model.addAttribute("country", tbUser.getCountry());
        return "user/userInfo";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList() {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }

    @ModelAttribute("numbersList")
    public List<String> getNumbersList() {
        List<String> numbersList = new ArrayList<String>();
        numbersList.add("1");
        numbersList.add("2");
        numbersList.add("3");
        numbersList.add("4");
        return numbersList;
    }

    @ModelAttribute("countryList")
    public Map<String, String> getCountryList() {
        Map<String, String> countryList = new HashMap<String, String>();
        countryList.put("US", "United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }

    @ModelAttribute("skillsList")
    public Map<String, String> getSkillsList() {
        Map<String, String> skillList = new HashMap<String, String>();
        skillList.put("Hibernate", "Hibernate");
        skillList.put("Spring", "Spring");
        skillList.put("Apache Hadoop", "Apache Hadoop");
        skillList.put("Struts", "Struts");
        return skillList;
    }
}
