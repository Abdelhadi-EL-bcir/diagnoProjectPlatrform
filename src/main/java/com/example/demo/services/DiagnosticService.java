package com.example.demo.services;

import com.example.demo.beans.Diagnostic;

public interface DiagnosticService {
    public Diagnostic create(Diagnostic diagnostic);
    public String delete(Long id);
    public double getScoreGlobal(Long idUser);
    public double getScoreGlobal(Long idUser,Long idCat);
}
