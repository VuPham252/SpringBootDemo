package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nhom1_Account")
public class Account {

    private String username;
    private String pass;
    private String email;
 

    public Account() {
    }


    public Account(String username, String pass, String email) {
        this.username = username;
        this.pass = pass;
        this.email = email;
    }
    
    @Column(name = "Username", nullable = false)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "Pass", nullable = false)
    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Id
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    // @Override
    // public String toString() {
    //     return this.email;
    // }
 
}
