package com.example.demo.controllers;

import com.example.demo.beans.User;
import com.example.demo.controllers.webServices.dto.LoginDto;
import com.example.demo.servicesImpl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthServiceImpl authServiceImpl ;

    @GetMapping("/login")
    public User login(@RequestBody LoginDto loginDto) {
        return authServiceImpl.login(loginDto.getEmail(), loginDto.getPassword());
    }

}
