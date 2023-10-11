package com.example.demo.servicesImpl;

import com.example.demo.beans.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User  login(String email , String password) {
        User user = userRepository.findUserByEmailAndPassword(email,password);
        if(user != null){
            return  user;
        }
        return  null;
    }

}
