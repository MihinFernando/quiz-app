package com.example.quizApp1.dao;

import com.example.quizApp1.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizeDao extends JpaRepository<Quiz, Integer> {

}
