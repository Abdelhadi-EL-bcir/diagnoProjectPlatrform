package com.example.demo.controllers.webServices.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
    private String password ;
    private String email ;
    public LoginDto(){

    }
}
