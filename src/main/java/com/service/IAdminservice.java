package com.service;
import com.pojo.Admins;
public interface IAdminservice {

    Admins findAdminByup(String username,String password);
}

