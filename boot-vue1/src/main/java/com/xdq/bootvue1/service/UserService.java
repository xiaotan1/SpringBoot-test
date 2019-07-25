package com.xdq.bootvue1.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserByid (Integer id) {
        System.out.println("get..."+id);
        return "user";
    }
    public void deleteUserByid (Integer id) {
        System.out.println("delete");
    }


}
