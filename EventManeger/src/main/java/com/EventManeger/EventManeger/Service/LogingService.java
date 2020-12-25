package com.EventManeger.EventManeger.Service;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Repository.LogingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LogingService {
    @Autowired
    private LogingRepository logingRepository;

    private List<LogingData> users=new ArrayList<>(Arrays.asList());

    public void save(LogingData user){
        logingRepository.save(user);
    }




}
