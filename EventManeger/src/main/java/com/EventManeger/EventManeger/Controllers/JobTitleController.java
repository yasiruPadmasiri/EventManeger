package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

    @GetMapping("/jobTitle")          //link eke wetena nama
    public String GetJobTitle() {

        return "jobTitle";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
