package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bridleWorksController {
    @RequestMapping(value = "/bridleWorks")
    public  String bridleWorks(){
        return "bridleWorks";
    }
}
