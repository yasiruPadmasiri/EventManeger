package com.EventManeger.EventManeger.Controller;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Service.LogingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

@Controller
public class LogingController {

     public  Integer logId;
     public Integer loginStatus=0;


    @Autowired
    private LogingService logingService;



    @RequestMapping(value = "/login")
    public String Log(){

        return "login";
    }
    @RequestMapping(value = "/")
    public String Logmain(){

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
        if (loginStatus.equals(1)){
            return "blank";
        }
        else{
           return "redirect:login";
        }


    }


    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public  String tryLog( LogingData user){

          Integer x=logingService.tryLogin(user);
          logId=x;
          System.out.println("");
          System.out.print(x);
        if(x==0){
            return  Log();

        }else if (x>0){

            loginStatus=1;
            return    Gohome();
        }
        else{
            return "redirect:login";
        }
    }








}
