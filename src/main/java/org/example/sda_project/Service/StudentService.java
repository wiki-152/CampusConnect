package org.example.sda_project.Service;

import org.example.sda_project.Bean.Student;
import org.example.sda_project.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    public Student getStudentByEmailAndPassword(String email, String password) {
        return studentRepository.findStudentByEmailAndPassword(email, password);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student findStudentByEmailAndPassword(String email, String password) {
        return studentRepository.findStudentByEmailAndPassword(email, password);
    }
}
