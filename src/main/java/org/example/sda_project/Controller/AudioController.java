package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/AudioHome")
public class AudioController {

    @RequestMapping("")
    public String getAudioHomePage()
    {
        return "Default";
    }

}
