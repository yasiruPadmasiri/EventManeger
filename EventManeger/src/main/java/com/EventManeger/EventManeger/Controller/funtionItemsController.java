package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class funtionItemsController {
    @RequestMapping(value = "/funtionItems")
    public  String funtionItems(){
        return "funtionItems";
    }

    @RequestMapping(value = "funtionItem_Search")
    public String funtionItem_Search(){
        return "functionItemsSearch";
    }
    @RequestMapping(value = "/functionItem_add_publish")
    public String functionItem_add_publish(){
        return "functionItems_add_publish";
    }
}
