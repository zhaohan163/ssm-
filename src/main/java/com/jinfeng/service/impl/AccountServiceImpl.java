package com.jinfeng.service.impl;

import com.jinfeng.dao.AccountDao;
import com.jinfeng.pojo.Contact;
import com.jinfeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/12/30 19:51
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Contact> findAll() {
        return accountDao.findAll();
    }
}
