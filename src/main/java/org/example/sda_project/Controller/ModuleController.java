package org.example.sda_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ModuleHome")
public class ModuleController {

    @RequestMapping("")
    public String ModuleHome() {
        return "Default";
    }

}
