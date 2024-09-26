package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CourseCatalog")
public class CourseCatalogController {

    @RequestMapping("")
    public String getCourseCatalogHomePage()
    {
        return "Default";
    }

}
