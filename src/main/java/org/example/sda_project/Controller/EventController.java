package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/EventHome")
public class EventController {

@RequestMapping("")
    public String Event() {
        return "Default";
    }

}
