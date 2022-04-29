package com.example.Komorebi.services;

import com.example.Komorebi.models.User;
import com.example.Komorebi.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRespository userRespository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*
        User u = userRespository.findByUsername(username);
        System.out.println(username);
        System.out.println(u);
        System.out.println(u.getPassword());
        System.out.println(u.getUsername());
         */

        return userRespository.findById(username).get();
    }
}