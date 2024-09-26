package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ScheduleHome")
public class ScheduleController {

    @RequestMapping("")
    public String getScheduleHomePage()
    {
        return "Default";
    }

}
