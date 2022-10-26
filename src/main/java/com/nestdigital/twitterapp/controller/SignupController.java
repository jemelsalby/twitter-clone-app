package com.nestdigital.twitterapp.controller;

import com.nestdigital.twitterapp.dao.SignupDao;
import com.nestdigital.twitterapp.model.SignupModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SignupController {

    @Autowired
    private SignupDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addUser",consumes = "application/json",produces = "application/json")
    public String signup(@RequestBody SignupModel signup){
        dao.save(signup);
        return "{status:'Success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewUser")
    public List<SignupModel> viewUser(){
        return (List<SignupModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path ="/login",consumes = "application/json",produces = "application/json")
    public List<SignupModel>login(@RequestBody SignupModel signup ){
        return (List<SignupModel>) dao.Signup(signup.getUserName(),signup.getPass());
    }
}
