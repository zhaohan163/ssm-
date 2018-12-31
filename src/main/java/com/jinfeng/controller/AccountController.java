package com.jinfeng.controller;

import com.jinfeng.pojo.Contact;
import com.jinfeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName AccountController
 * @Author 123456
 * @Description TODO  这样的
 * @Version 1.0
 * @Date 2018/12/30 20:26
 **/

@Controller
@RequestMapping("/contact")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Contact> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
