package com.jinfeng.test;

import com.jinfeng.pojo.Contact;
import com.jinfeng.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName TestDemo
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/12/30 19:47
 **/

public class TestDemo {
    @Test
    public void findAll(){
        ApplicationContext xm = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = xm.getBean(AccountService.class);
        List<Contact> contactList = accountService.findAll();
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}
