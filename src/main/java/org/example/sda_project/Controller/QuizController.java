package org.example.sda_project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/QuizHome")
public class QuizController {

    @RequestMapping("")
    public String getQuizHomePage()
    {
        return "Default";
    }

}
