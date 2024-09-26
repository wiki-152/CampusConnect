package org.example.sda_project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PostFactoryHome")
public class PostFactoryController {

    @RequestMapping("")
    public String getPostFactoryHomePage()
    {
        return "Default";
    }

}
