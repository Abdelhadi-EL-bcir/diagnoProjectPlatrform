package com.example.demo.repositories;

import com.example.demo.beans.Responce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponceRepository extends JpaRepository<Responce ,Long> {
    public Responce findResponceById(Long id);
    public Responce findResponceByQuestion(Long id);
}
