package com.example.demo.repositories;

import com.example.demo.beans.Category;
import com.example.demo.beans.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question , Long> {
   public Question findQuestionById(Long id);
   public List<Question> findQuestionByCategory(Long id);
}
