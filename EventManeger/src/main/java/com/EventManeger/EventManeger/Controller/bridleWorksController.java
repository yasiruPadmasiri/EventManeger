package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bridleWorksController {
    @RequestMapping(value = "/bridleWorks")
    public  String bridleWorks(){
        return "bridleWorks";
    }

    @RequestMapping(value = "bridle_Search")
    public String bridleSearch(){
        return "bridleSearch";
    }

    @RequestMapping(value = "bridle_add_publish")
    public  String bridle_add_publish(){
        return "bridle_add_publish";
    }
}
