package com.example.demo.services;

import com.example.demo.beans.Diagnostic;

public interface DiagnosticService {
    public Diagnostic create(Diagnostic diagnostic);
    public String getScoreGlobal(Long id);
    public String getScoreByCat(Long id,Long idCat);
    public Diagnostic getDiagnostic(Long id);
}
