package org.example.sda_project.Service;

import org.example.sda_project.Bean.Quiz;
import org.example.sda_project.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public Quiz getQuizById(Integer id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz updateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Integer id) {
        quizRepository.deleteById(id);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
}
