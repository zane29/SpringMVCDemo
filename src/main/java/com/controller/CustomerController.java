package com.controller;

import com.dao.TbCustomerRepository;
import com.bean.TbCustomer;
import com.data.response.BaseResponse;
import com.utils.ReturnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

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
    TbCustomerRepository tbCustomerRepository;

    //http://localhost:8080/customer/get?id=1
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public TbCustomer get(@RequestParam("id") Long id) {
        TbCustomer tbCustomer = tbCustomerRepository.findById(id);
        return tbCustomer;//返回{"custId":1,"name":"yiibai","age":29}
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<List<TbCustomer>> insert(@RequestBody @Valid TbCustomer tbCustomer, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList) {
                System.out.println(error.getCode() + " msg=" + error.getDefaultMessage());
            }
            return null;
        }

        tbCustomer = tbCustomerRepository.save(tbCustomer);
        List<TbCustomer> responseList = new ArrayList<TbCustomer>();
        responseList.add(tbCustomer);
        return ReturnInfo.genResponseEntity(ReturnInfo.SUCCESS, responseList);
    }
}
