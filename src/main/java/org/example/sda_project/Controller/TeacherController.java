package org.example.sda_project.Controller;


import org.example.sda_project.Bean.Teacher;
import org.example.sda_project.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/TeacherHome")
public class TeacherController {

    private Teacher teacher;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("")
    public String getTeacherHomePage() {
        return "TeacherHome";
    }

    @GetMapping("/{teacherId}")
    public String getTeacherHomePage(@PathVariable("teacherId") Integer teacherId, Model model) {
        teacher = teacherService.getTeacherById(teacherId);

        // Print the teacher ID to the console
        //System.out.println("Teacher ID: " + teacherId);

        model.addAttribute("teacher", teacher);
        return "TeacherHome";
    }

    @RequestMapping("ProfileTeacher")
    public String getTeacherProfilePage(Model model) {
        model.addAttribute("teacher", teacher);

        return "ProfileTeacher";
    }

    @PostMapping("ProfileTeacher/ProfileSave")
    public String saveTeacherProfile(@RequestParam("firstName") String firstName,
                                     @RequestParam("lastName") String lastName,
                                     @RequestParam("emailaddress") String email, @RequestParam("password") String password,
                                     @RequestParam("dateOfBirth") String dateOfBirth, @RequestParam("gender") String gender) {

        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setEmail(email);
        teacher.setPassword(password);
        teacher.setDateOfBirth(dateOfBirth);
        teacher.setGender(gender);

        teacherService.updateTeacher(teacher);


        return "redirect:/TeacherHome";
    }


    @GetMapping("Feed")
    public String getFeedPage() {
        return "Feed";
    }

    @GetMapping("E-Learning_Teacher")
    public String getElearningPage() {
        return "E-Learning_Teacher";
    }

    @GetMapping("LibraryHome")
    public String getLibraryPage() {
        return "LibraryHome";
    }

    @RequestMapping("Logout")
    public String logout() {
        return "redirect:/";
    }

}
