package com.controller;

import com.dao.CustomerDAO;
import com.model.Customer;
import com.model.Message;
import com.utils.ReturnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/28
 * Time: 16:20
 */
@Controller
@RequestMapping(value = "/customer")
@Scope("prototype")//将其设置为多例模式。
public class CustomerController {
    @Autowired
    Customer customer;

    @Qualifier("CustomerDAOImpl")
    @Autowired
    CustomerDAO customerDAO;

    @RequestMapping(value = "/get", method = RequestMethod.GET)//http://localhost:8080/customer/get?id=1
    @ResponseBody
    public Customer get(@RequestParam("id") int id) {
        customer =customerDAO.findByCustomerId(id);
        return customer;//返回{"custId":1,"name":"yiibai","age":29}
    }
    //http://localhost:8080/customer/getmessage?name=zhouhaiming&sex=man&age=22
    @RequestMapping(value = "/getmessage", method = RequestMethod.GET)
    @ResponseBody
    public Message getmessage(@ModelAttribute("message") Message message) {
        return message;//返回{"name":"zhouhaiming","sex":"man","age":"22"}
    }

    //http://localhost:8080/customer/getmessagepage?name=zhouhaiming&sex=man&age=22
    @RequestMapping(value = "/getmessagepage", method = RequestMethod.GET)
    public String getmessagepage(@ModelAttribute("message") Message message) {
        return "message";//返回message.jps 页面
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<List<Customer>>  insert(@RequestBody @Valid Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList) {
                System.out.println(error.getCode()+" msg="+ error.getDefaultMessage());
            }
            return null;
        }
        customerDAO.insert(customer);
        customer =customerDAO.findByCustomerId(1);
        List<Customer> responseList = new ArrayList<Customer>();
        responseList.add(customer);
        return ReturnInfo.genResponseEntity(ReturnInfo.SUCCESS,responseList);
    }


}
