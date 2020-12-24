package com.EventManeger.EventManeger.Services;

import com.EventManeger.EventManeger.Models.Loging;
import com.EventManeger.EventManeger.Repositories.LogingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogingService {
    @Autowired
    private LogingRepository logingrepository;

    public void createAcount(Loging logdata){
        logingrepository.save(logdata);
    }



}
