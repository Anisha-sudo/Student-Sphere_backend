package com.example.outreach_portal.controller;


import com.example.outreach_portal.bean.admin;
import com.example.outreach_portal.service.AdminService;
import com.example.outreach_portal.service.Implementation.AdminImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {


    @Autowired
    AdminImplementation services;


    @CrossOrigin(origins = "*")
    @PostMapping( "/adminlogin")
    public String adminlogin(@RequestBody admin object) {

        return services.adminlogin(object);
    }

}
