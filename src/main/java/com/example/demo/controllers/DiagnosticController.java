package com.example.demo.controllers;

import com.example.demo.beans.Diagnostic;
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

    @GetMapping("/getGlobal/{id}")
    public String getScoreGlobal(@PathVariable Long id) {
        return diagnosticServiceImpl.getScoreGlobal(id);
    }

    @GetMapping("/getByCat/{id}/{idCat}")
    public String getScoreByCat(@PathVariable Long id,@PathVariable Long idCat) {
        return diagnosticServiceImpl.getScoreByCat(id, idCat);
    }

    @GetMapping("/get/{id}")
    public Diagnostic getDiagnostic(@PathVariable Long id){
        return diagnosticServiceImpl.getDiagnostic(id);
    }
}
