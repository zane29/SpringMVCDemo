package com.controller;

import com.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhouhaiming on 2017-4-27 14:28
 * Email: dg_chow@163.com
 */
@Controller
public class MessageController {
    @RequestMapping(value = "/addMessage", method = RequestMethod.GET)
    public ModelAndView message() {
        return new ModelAndView("addMessage", "command", new Message());
    }

    @ModelAttribute("Message")
    public Message createMessageModel() {
        return new Message();
    }

    @RequestMapping(value = "/addMessage", method = RequestMethod.POST)
    public String addMessage(@ModelAttribute("Message") @Validated Message message, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addMessage";
        }
        model.addAttribute("name", message.getName());
        model.addAttribute("age", message.getAge());
        model.addAttribute("sex", message.getSex());
        return "message2";
    }


}

