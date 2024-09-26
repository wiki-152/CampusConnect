package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/NewsHome")
public class NewsController {

    @RequestMapping("")
    public String NewsHome() {
        return "Default";
    }

}
