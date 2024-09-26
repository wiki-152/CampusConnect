package org.example.sda_project.Service;

import org.example.sda_project.Bean.Enrollment;
import org.example.sda_project.Repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public void addEnrollment(Enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getEnrollmentsByStudentId(Integer studentId)
    {
        return enrollmentRepository.findEnrollmentsByStudentId(studentId);
    }

    public List<Enrollment> getEnrollmentsByCourseId(Integer courseId)
    {
        return enrollmentRepository.findEnrollmentsByCourseId(courseId);
    }

    public Enrollment getEnrollmentByStudentIdAndCourseId(Integer studentId, Integer courseId)
    {
        return enrollmentRepository.findEnrollmentByStudentIdAndCourseId(studentId, courseId);
    }

    public void deleteEnrollment(Integer id)
    {
        enrollmentRepository.deleteById(id);
    }

    public List<Enrollment> getAllEnrollments()
    {
        return enrollmentRepository.findAll();
    }

}
