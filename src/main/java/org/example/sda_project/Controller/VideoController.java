package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/VideoHome")
public class VideoController {

    @RequestMapping("")
    public String getVideoHomePage()
    {
        return "Default";
    }

}
