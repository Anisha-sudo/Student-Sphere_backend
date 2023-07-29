package com.example.outreach_portal.dao;

import com.example.outreach_portal.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SaveUserDao extends JpaRepository<User, String>{

        }



