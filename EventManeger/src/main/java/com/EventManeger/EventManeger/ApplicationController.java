package com.EventManeger.EventManeger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String goHome(){
        return "index";

    }
    @GetMapping("/login")
    public String Index(){
        return "index";

    }
    @GetMapping("/index")
    public String goLoging(){
        return "login";

    }

}
