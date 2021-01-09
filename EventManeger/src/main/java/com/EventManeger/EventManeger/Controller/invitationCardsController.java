package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class invitationCardsController {
    @RequestMapping(value = "/invitationCards")
    public String invitationCards(){
        return "invitationCards";
    }
    @RequestMapping(value = "cards_Search")
    public String cards_Search(){
        return "invitationCardSearch";
    }
}
