package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/EnrollmentHome")
public class EnrollmentController {

    @RequestMapping("")
    public String getEnrollmentHomePage()
    {
        return "Default";
    }


}
