package org.example.sda_project.Controller;

import org.example.sda_project.Bean.*;
import org.example.sda_project.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("")
    public String getIndexPage()
    {
        return "index";
    }

    @GetMapping("Login")
    public String getLoginPage()
    {
        return "Login";
    }

    @PostMapping("login")
    public String login (@RequestParam ("email") String email, @RequestParam ("password") String password)
    {
        Student student = studentService.getStudentByEmailAndPassword(email, password);

        Teacher teacher = teacherService.getTeacherByEmailAndPassword(email, password);

        // return with id of student or teacher

        if (student != null && teacher == null)
        {
            return "redirect:/StudentHome/" + student.getId();
        }
        else if (teacher != null && student == null)
        {
            return "redirect:/TeacherHome/" + teacher.getId();
        }
        {
            return "Login";
        }
    }

    @GetMapping("SignUp")
    public String getSignUpPage()
    {
        return "SignUp";
    }

    // Save data to database of student
    @PostMapping("submit_signup")
    public String getSubmitSignupPage(@RequestParam("firstName") String firstName,
                                      @RequestParam("lastName") String lastName,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password,
                                      @RequestParam("dateOfBirth") String dateOfBirth,
                                      @RequestParam("gender") String gender,
                                      @RequestParam("role") String role)
    {
        if (role.equals("Student"))
        {
            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setEmail(email);
            student.setPassword(password);
            student.setDateOfBirth(dateOfBirth);
            student.setGender(gender);

            studentService.addStudent(student);
            return "Login";
        }
        else if (role.equals("Teacher"))
        {
            Teacher teacher = new Teacher();

            teacher.setFirstName(firstName);
            teacher.setLastName(lastName);
            teacher.setEmail(email);
            teacher.setPassword(password);
            teacher.setDateOfBirth(dateOfBirth);
            teacher.setGender(gender);

            teacherService.addTeacher(teacher);
            return "Login";
        }
        else
        {
            return "index";
        }

    }


}
