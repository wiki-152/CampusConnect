package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/EventFactoryHome")
public class EventFactoryController {

    @RequestMapping("")
    public String showEventFactory() {
        return "Default";
    }

}
