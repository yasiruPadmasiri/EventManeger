package com.EventManeger.EventManeger.Service;

import com.EventManeger.EventManeger.Model.LogingData;
import com.EventManeger.EventManeger.Model.UserPrincipal;
import com.EventManeger.EventManeger.Repository.LogingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {

    @Autowired
     private LogingRepository loginRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LogingData user=  loginRepository.findByUsername( username);
        if (user==null){
            throw new UsernameNotFoundException("user Not Found");
        }
        return new UserPrincipal(user);
    }
}

