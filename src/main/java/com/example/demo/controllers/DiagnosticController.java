package com.example.demo.controllers;

import com.example.demo.beans.Diagnostic;
import com.example.demo.repositories.DiagnosticRepository;
import com.example.demo.servicesImpl.DiagnosticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/diagno")
public class DiagnosticController {
    @Autowired
    private DiagnosticServiceImpl diagnosticServiceImpl;

    @PostMapping("/add")
    public Diagnostic create(@RequestBody Diagnostic diagnostic) {
        return diagnosticServiceImpl.create(diagnostic);
    }

    @DeleteMapping("/edit/{id}")
    public String delete(@PathVariable Long id) {
        return diagnosticServiceImpl.delete(id);
    }

    @GetMapping("/global/{id}")
    public double getScoreGlobal(@PathVariable Long id) {
        return diagnosticServiceImpl.getScoreGlobal(id);
    }

    @GetMapping("/byCat/{idDiagno}/{idCat}")
    public double getScoreByCat(@PathVariable Long idDiagno,@PathVariable Long idCat) {
        return diagnosticServiceImpl.getScoreByCat(idDiagno, idCat);
    }
}
