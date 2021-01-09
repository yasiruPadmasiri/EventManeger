package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class photographyController {
    @RequestMapping(value = "/photography")
    public String photography(){
        return  "photography";
    }
    @RequestMapping(value = "photography_Search")
    public String photography_Search(){
        return "photographySearch";
    }

}
