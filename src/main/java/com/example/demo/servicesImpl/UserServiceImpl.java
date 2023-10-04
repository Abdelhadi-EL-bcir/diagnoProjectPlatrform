package com.example.demo.servicesImpl;

import com.example.demo.beans.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, Long id) {
        if(userRepository.findById(id) != null){
            User userToUpdate = userRepository.findUserById(id);
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setUsername(user.getUsername());
            userToUpdate.setRole(user.getRole());
            return userRepository.findUserById(userToUpdate.getId());
        }else{
            return  null;
        }
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "Responce has deleted successfully";
    }

    @Override
    public User get(Long id) {
        return  userRepository.findUserById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
