package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/AdminHome")
public class AdminController {

        @RequestMapping("")
        public String getAdminHomePage()
        {
            return "Default";
        }
}
