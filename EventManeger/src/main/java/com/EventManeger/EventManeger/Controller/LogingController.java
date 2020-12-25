package com.EventManeger.EventManeger.Controller;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Service.LogingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogingController {
    @Autowired
    private LogingService logingService;



    // signup view load
    @RequestMapping(value = "/signup")
    public String  signUp(){

        return "signupPage";
    }

    // create account save model








}
