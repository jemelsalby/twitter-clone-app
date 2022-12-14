package com.nestdigital.twitterapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class SignupModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lName;
    private String mobile;
    private String userName;

    private String pass;
    private String email;
    private String address;

    public SignupModel(int id, String name, String lName, String mobile, String userName, String pass, String email, String address) {
        this.id = id;
        this.name = name;
        this.lName = lName;
        this.mobile = mobile;
        this.userName = userName;
        this.pass = pass;
        this.email = email;
        this.address = address;
    }

    public SignupModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
