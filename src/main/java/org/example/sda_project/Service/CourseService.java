package org.example.sda_project.Service;

import org.example.sda_project.Bean.Course;
import org.example.sda_project.Bean.Student;
import org.example.sda_project.Repository.CourseRepository;
import org.example.sda_project.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Course getCourseById(Integer id)
    {
        return courseRepository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name)
    {
        return courseRepository.findCourseByName(name);
    }

    public Course updateCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public void deleteCourse(Integer id)
    {
        courseRepository.deleteById(id);
    }

    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }

    //---------------------------------------------------------------------------------------------------------
    /*public List<Course> getCoursesByStudentId(Integer studentId)
    {

    }*/

    public List<Course> getCoursesByTeacherId(Integer teacherId)
    {
        return courseRepository.findCoursesByLecturerId(teacherId);
    }



}
