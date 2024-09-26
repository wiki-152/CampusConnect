package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PhotoHome")
public class PhotoController {

    @RequestMapping("")
    public String getPhotoHomePage()
    {
        return "Default";
    }

}
