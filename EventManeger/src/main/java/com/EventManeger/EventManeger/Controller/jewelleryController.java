package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jewelleryController {
    @RequestMapping(value = "/jewellery")
    public String jewellery(){
        return "jewellery";
    }
}
