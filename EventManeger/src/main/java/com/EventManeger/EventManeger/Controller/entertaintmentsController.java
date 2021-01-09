package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class entertaintmentsController {
    @RequestMapping(value = "/entertaintments")
    public String entertaintments(){
        return "entertaintments";
    }
}
