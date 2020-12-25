package com.EventManeger.EventManeger.Controller;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Service.LogingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogingController {
    @Autowired
    private LogingService logingService;

    @RequestMapping(value = "/login")
    public String Log(){
        return "login";
    }
    @RequestMapping(value = "/signup")
    public String  signUp(){
        return "signupPage";
    }

    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public String createAccount( LogingData user){
        logingService.save(user);
        return "login";
    }
    @RequestMapping(value = "loguser",method = RequestMethod.POST)
    public String logging(LogingData user){
        return  "login";
    }



}
