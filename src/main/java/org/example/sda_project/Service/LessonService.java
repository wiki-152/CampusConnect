package org.example.sda_project.Service;

import org.example.sda_project.Bean.Lesson;
import org.example.sda_project.Repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public Lesson getLessonById(Integer id) {
        return lessonRepository.findById(id).orElse(null);
    }

    public Lesson updateLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public void deleteLesson(Integer id) {
        lessonRepository.deleteById(id);
    }

    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }
}
