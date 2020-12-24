package com.EventManeger.EventManeger.Services;

import com.EventManeger.EventManeger.Models.Users;
import com.EventManeger.EventManeger.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersRepository userrepository;

    public void CreateUser(Users user){

        userrepository.save(user);
    }
}
