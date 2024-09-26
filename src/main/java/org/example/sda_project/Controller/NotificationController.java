package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/NotificationHome")
public class NotificationController {

    @RequestMapping("")
    public String NotificationHome() {
        return "Default";
    }

}
