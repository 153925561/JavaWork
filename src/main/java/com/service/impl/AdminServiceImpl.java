package com.service.impl;

import com.pojo.Admins;
import com.service.IAdminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class AdminServiceImpl implements IAdminservice{

    @Autowired
    private com.dao.AdminsMapper adminsMapper;

    @Override

    public Admins findAdminByup(String username,String password){

        Admins admins=adminsMapper.findAdminByup(username,password);
        return admins;


    }





}
