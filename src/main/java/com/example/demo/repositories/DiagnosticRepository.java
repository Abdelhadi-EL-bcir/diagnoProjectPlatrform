package com.example.demo.repositories;

import com.example.demo.beans.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticRepository extends JpaRepository<Diagnostic , Long> {
    public Diagnostic findDiagnosticById(Long Id);
}
