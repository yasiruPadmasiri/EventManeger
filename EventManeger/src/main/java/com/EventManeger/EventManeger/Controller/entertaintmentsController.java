package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class entertaintmentsController {
    @RequestMapping(value = "/entertaintments")
    public String entertaintments(){
        return "entertaintments";
    }
    @RequestMapping(value = "/entertainment_Search")
    public String entetainmentSearch(){
        return "entertaintmentSearch";
    }

    @RequestMapping(value = "entertainment_add_publish")
    public String entertainment_add_publish(){
        return "entertaintment_add_publish";

    }
}
