package com.example.demo.controllers;

import com.example.demo.beans.Question;
import com.example.demo.servicesImpl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/qst")
public class QuestionController {

    @PostMapping("/add")
    public Question create(@RequestBody  Question question) {
        return questionServiceImpl.create(question);
    }

    @PutMapping("/edit/{id}")
    public Question update(@RequestBody Question question,@PathVariable Long id) {
        return questionServiceImpl.update(question, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable  Long id) {
        return questionServiceImpl.delete(id);
    }


    @GetMapping("/get/{id}")
    public Question get(@PathVariable Long id) {
        return questionServiceImpl.get(id);
    }

    @GetMapping("/all")
    public List<Question> getAll() {
        return questionServiceImpl.getAll();
    }

    @GetMapping("/cat/{id}")
    public List<Question> getByCategory(@PathVariable  Long id) {
        return questionServiceImpl.getByCategory(id);
    }

    @Autowired
    private QuestionServiceImpl questionServiceImpl;

}
