package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

    // Get All Lessons
    @Query("SELECT l FROM Lesson l")
    List<Lesson> getAllLessons();

}
