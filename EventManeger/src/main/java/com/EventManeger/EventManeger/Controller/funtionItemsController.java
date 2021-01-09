package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class funtionItemsController {
    @RequestMapping(value = "/funtionItems")
    public  String funtionItems(){
        return "funtionItems";
    }
}
