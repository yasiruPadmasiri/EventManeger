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




    public Integer tryLogin(LogingData user){


        if (user.getUsername()==null){
            return  0;
        }
        Integer x=0;
        users=logingRepository.findAll();

        LogingData U=users.stream().filter(t->user.getUsername().equals(t.getUsername())).findFirst().orElse(null);
            System.out.print(U);





        if (x==0){
            return  0;
        }else{
            return 1;
        }



    }



}
