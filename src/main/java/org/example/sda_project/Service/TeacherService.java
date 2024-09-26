package org.example.sda_project.Service;

import org.example.sda_project.Bean.Teacher;
import org.example.sda_project.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public Teacher getTeacherByEmail(String email) {
        return teacherRepository.findTeacherByEmail(email);
    }

    public Teacher getTeacherByEmailAndPassword(String email, String password) {
        return teacherRepository.findTeacherByEmailAndPassword(email, password);
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
