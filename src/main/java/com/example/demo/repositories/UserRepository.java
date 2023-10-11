package com.example.demo.repositories;

import com.example.demo.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    public User findUserById(Long id);
    public User findUserByEmailAndPassword(String email , String password);
}
