package com.jinfeng.dao;

import com.jinfeng.pojo.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     * 查询全部是吗
     */
    public List<Contact> findAll();
}
