package com.example.outreach_portal.dao;

import com.example.outreach_portal.bean.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdminDao extends JpaRepository<admin, String> {




    admin findByUsernameAndPassword(int username, String password);
}
