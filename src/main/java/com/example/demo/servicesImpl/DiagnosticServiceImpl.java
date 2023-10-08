package com.example.demo.servicesImpl;

import com.example.demo.beans.Category;
import com.example.demo.beans.Diagnostic;
import com.example.demo.beans.Question;
import com.example.demo.beans.Responce;
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
    public String delete(Long id) {
        diagnosticRepository.deleteById(id);
        return "Diagnostic deleted successully";
    }

    @Override
    public double getScoreGlobal(Long id) {
         Diagnostic diagnostic = diagnosticRepository.findDiagnosticById(id);
         double result = 0;
         if(diagnostic != null){
             List<Responce> responceList = diagnostic.getResponceList();
             for (Responce responce:responceList){
                 if (responce != null){
                     result += responce.getNote();
                 }
             }
             return result;
         }
         return -1;
    }

    @Override
    public double getScoreByCat(Long idDiagno, Long idCat) {
        Category category = categoryRepository.findCategoryById(idCat);
        Diagnostic diagnostic = diagnosticRepository.findDiagnosticById(idDiagno);
        double result = 0;
        if(category != null && diagnostic != null){
          List<Question> questionList = category.getQuestionList();
            for (Question question:
                 questionList) {
                if(question != null){
                    Responce responce = responceRepository.
                            findResponceByQuestionAndDiagnostic(question , diagnostic);
                    result += responce.getNote();
                }
            }
            return result;
        }
        return  -1;
    }
}
