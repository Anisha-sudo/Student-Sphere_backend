package com.example.outreach_portal.bean;



import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "admin")
public class admin {
    public admin(int username, String password) {
        this.username = username;
        this.password = password;
    }

    public admin() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


     @Id
     int username;

    String password;

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }
}
