package com.example.demo.services;


import com.example.demo.beans.User;

import java.util.List;

public interface UserService {
    public User create(User user);
    public User update(User user , Long id);
    public int delete(Long id);
    public User get(Long id);
    public List<User> getAll();
}
