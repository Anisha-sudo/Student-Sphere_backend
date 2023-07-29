package com.example.outreach_portal.service.Implementation;

import com.example.outreach_portal.bean.admin;
import com.example.outreach_portal.dao.AdminDao;
import com.example.outreach_portal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminImplementation implements AdminService {

    @Autowired
    AdminDao dao;


    @Override
    public String adminlogin(admin object){

        admin data = new admin();

        data = dao.findByUsernameAndPassword(object.getUsername(), object.getPassword());

        if(data != null){
            return "sucess";
        }
        return "Invalid Credentials";
    }


}
