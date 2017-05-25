package com.controller;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

/*
* 这里的的接口要使用chrome的postman插件来测试，因为是postjson的字符串。
*
*
* */
@Controller
@RequestMapping(value = "/formHandling")
public class StudentController {
    //http://localhost:8080/formHandling/student
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        model.addAttribute("receivePaper", student.isReceivePaper());
        model.addAttribute("favoriteFrameworks", student.getFavoriteFrameworks());
        model.addAttribute("gender", student.getGender());
        model.addAttribute("favoriteNumber", student.getFavoriteNumber());
        model.addAttribute("address", student.getAddress());
        model.addAttribute("country", student.getCountry());
        model.addAttribute("skills", student.getSkills());
        return "result";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList()
    {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }

    @ModelAttribute("numbersList")
    public List<String> getNumbersList()
    {
        List<String> numbersList = new ArrayList<String>();
        numbersList.add("1");
        numbersList.add("2");
        numbersList.add("3");
        numbersList.add("4");
        return numbersList;
    }
    @ModelAttribute("countryList")
    public Map<String, String> getCountryList()
    {
        Map<String, String> countryList = new HashMap<String, String>();
        countryList.put("US", "United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }

    @ModelAttribute("skillsList")
    public Map<String, String> getSkillsList()
    {
        Map<String, String> skillList = new HashMap<String, String>();
        skillList.put("Hibernate", "Hibernate");
        skillList.put("Spring", "Spring");
        skillList.put("Apache Hadoop", "Apache Hadoop");
        skillList.put("Struts", "Struts");
        return skillList;
    }
}