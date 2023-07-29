package com.example.outreach_portal.controller;


import com.example.outreach_portal.bean.User;
import com.example.outreach_portal.service.Implementation.SaveUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SaveUserController {



    @Autowired
    SaveUserImpl service;


    @CrossOrigin(origins  = "*")
    @PostMapping("/saveuser")
    public String saveuser(@RequestBody User object){

        return service.saveuser(object);

    }
}
