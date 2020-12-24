package com.EventManeger.EventManeger.Controllers;

import com.EventManeger.EventManeger.Models.Users;
import com.EventManeger.EventManeger.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class AccountController {

    @Autowired
    private UsersService usersservice;
    @GetMapping("/login")
    public  String GoLoging(){
        return "login";
    }
    @GetMapping("/signup")
    public  String Signinup(){
        return "signupPage";
    }

    @RequestMapping(value = "/signup/Create",method = RequestMethod.POST)
    public String createAccount(@RequestBody Users user){
        usersservice.CreateUser(user);
        return "login";
    }
}
