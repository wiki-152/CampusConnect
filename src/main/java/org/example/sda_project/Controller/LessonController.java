package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/LessonHome")
public class LessonController {

    @RequestMapping("")
    public String Lesson() {
        return "Default";
    }

}
