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
    public void findById(LogingData user){
        users=logingRepository.findAll();
        for (int i = 0; i < users.size(); i++) {
            LogingData U = users.get(i);
            if(U.getUsername().equals(user.getUsername())|| U.getPassword().equals(user.getPassword())){

            }
        }


    }
}
