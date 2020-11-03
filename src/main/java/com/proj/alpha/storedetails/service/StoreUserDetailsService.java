package com.proj.alpha.storedetails.service;

import com.proj.alpha.empdetails.model.EmpDetails;
import com.proj.alpha.empdetails.service.IEmpDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StoreUserDetailsService implements UserDetailsService {
    @Autowired
    IEmpDetailsService empDetailsService;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        EmpDetails empDetails = empDetailsService.getEmpDetailsByLoginId(loginId);

       return new User(empDetails.getLoginId(),empDetails.getPassword(),new ArrayList<>());
    }
}
