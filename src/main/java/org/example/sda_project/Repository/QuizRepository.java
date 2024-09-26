package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

    // Get All Quizzes
    @Query("SELECT q FROM Quiz q")
    List<Quiz> getAllQuizzes();

}
