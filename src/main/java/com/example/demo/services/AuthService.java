package com.example.demo.services;

import com.example.demo.beans.User;

public interface AuthService {
    public User login(String email , String password);
}
