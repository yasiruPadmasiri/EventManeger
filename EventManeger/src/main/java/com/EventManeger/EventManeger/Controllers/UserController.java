package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")          //link eke wetena nama @notation ekn den nama
    public String GetUser() {

        return "user";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
