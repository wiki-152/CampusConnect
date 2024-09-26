package org.example.sda_project.Repository;

import org.example.sda_project.Bean.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    @Query("SELECT e FROM Enrollment e WHERE e.studentId = :studentId")
    List<Enrollment> findEnrollmentsByStudentId(Integer studentId);

    @Query("SELECT e FROM Enrollment e WHERE e.courseId = :courseId")
    List<Enrollment> findEnrollmentsByCourseId(Integer courseId);

    @Query("SELECT e FROM Enrollment e WHERE e.studentId = :studentId AND e.courseId = :courseId")
    Enrollment findEnrollmentByStudentIdAndCourseId(Integer studentId, Integer courseId);
}
