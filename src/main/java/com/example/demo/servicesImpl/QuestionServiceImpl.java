package com.example.demo.servicesImpl;

import com.example.demo.beans.Question;
import com.example.demo.repositories.QuestionRepository;
import com.example.demo.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question update(Question question, Long id) {
        return null;
    }

    @Override
    public String delete(Long id) {
        questionRepository.deleteById(id);
        return "Question has deleted successfully";
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findQuestionById(id);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }
}
