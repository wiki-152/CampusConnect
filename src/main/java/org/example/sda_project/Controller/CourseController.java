package org.example.sda_project.Controller;

import org.example.sda_project.Bean.Course;
import org.example.sda_project.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/CourseHome")
public class CourseController {

    @Autowired
    CourseService courseService;

    // Default path for all course endpoints
    @GetMapping("")
    public String getCourseHomePage()
    {
        return "CourseHome";
    }

    @RequestMapping("AddCourse")
    public String getAddCoursePage()
    {
        return "AddCourse";
    }

    @PostMapping("addCourse_submit")
    public String addCourse(@RequestParam("courseName") String courseName,
                            @RequestParam("courseCode") String courseCode,
                            @RequestParam("courseDescription") String courseDescription,
                            @RequestParam("courseCredit") Integer courseCredit)
    {

        // Add course to database

        Course course = new Course();

        course.setCourseName(courseName);
        course.setCourseCode(courseCode);
        course.setCourseDescription(courseDescription);
        course.setCourseCredit(courseCredit);

        course.setCourseLecturerId(1); // Set the lecturer ID to 1 for now

        // Save course to database

        courseService.addCourse(course);

        return "redirect:/TeacherHome";
    }
}
