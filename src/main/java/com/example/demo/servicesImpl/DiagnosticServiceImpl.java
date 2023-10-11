package com.example.demo.servicesImpl;

import com.example.demo.beans.Diagnostic;
import com.example.demo.beans.Responce;
import com.example.demo.beans.Category;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.DiagnosticRepository;
import com.example.demo.repositories.ResponceRepository;
import com.example.demo.services.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticServiceImpl implements DiagnosticService {
    @Autowired
    private DiagnosticRepository diagnosticRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ResponceRepository responceRepository;

    @Override
    public Diagnostic create(Diagnostic diagnostic) {
        return diagnosticRepository.save(diagnostic);
    }

    @Override
    public String getScoreGlobal(Long id) {
         Diagnostic diagnostic = diagnosticRepository.findDiagnosticById(id);
         String user = diagnostic.getUser().getUsername();
         double result = 0;
         if(diagnostic != null){
             List<Responce> responceList = diagnostic.getResponceList();
             for (Responce responce:responceList){
                 if (responce != null){
                     result += responce.getNote();
                 }
             }
             return "The global score of "+user+" is "+ result;
         }
         return "Error";
    }

    @Override
    public String getScoreByCat(Long diagnosticId, Long categoryId) {
        Diagnostic diagnostic = diagnosticRepository.findDiagnosticById(diagnosticId);
        String user = diagnostic.getUser().getUsername();
        Category category = categoryRepository.findCategoryById(categoryId);
        double result = 0;
        if (diagnostic != null && category != null) {
            List<Responce> responceList = diagnostic.getResponceList();
            for (Responce responce : responceList) {
                if (responce.getQuestion().getCategory().equals(category)) {
                    result += responce.getNote();
                }
            }
            return "The global score of "+user+" in "+category.getName()+" is "+ result;
        }
        return "Error";
    }

    @Override
    public Diagnostic getDiagnostic(Long id) {
        return diagnosticRepository.findDiagnosticById(id);
    }
}
