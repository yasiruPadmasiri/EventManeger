package com.EventManeger.EventManeger.Controller;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Service.LogingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

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

    @RequestMapping(value = "index")
    public String Gohome(){
        return "land";
    }

    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public  String tryLog( LogingData user){
        Integer x=logingService.tryLogin(user);
        if(x==0){
        return    Gohome();
        }else{
        return "signupPage";
        }
    }








}
