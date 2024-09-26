package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("SELECT c FROM Course c WHERE c.courseName = :courseName")
    Course findCourseByName(String courseName);

    @Query("SELECT c FROM Course c WHERE c.courseName = :courseName AND c.courseCode = :courseCode")
    Course findCourseByNameAndCode(String courseName, String courseCode);

    @Query("SELECT c FROM Course c WHERE c.courseCode = :courseCode")
    Course findCourseByCode(String courseCode);

    @Query("SELECT c FROM Course c WHERE c.courseLecturerId = :courseLecturerId")
    List<Course> findCoursesByLecturerId(Integer courseLecturerId);

    @Query("SELECT c FROM Course c WHERE c.courseLecturerId = :courseLecturerId AND c.courseName = :courseName")
    List<Course> findCoursesByLecturerIdAndName(Integer courseLecturerId, String courseName);
}
