package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jewelleryController {
    @RequestMapping(value = "/jewellery")
    public String jewellery(){
        return "jewellery";
    }
    @RequestMapping(value = "/jewellery_Search")
    public String jewellery_Search(){
        return "jewellerySearch";
    }
    @RequestMapping(value = "/jewellery_add_publish")
    public String jewellery_add_publish(){
        return "jewellery_add_publish";
    }
}
