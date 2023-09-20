package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(path = "/siteinfo")
    public String getResult(Model model){
        model.addAttribute("info","Info For Result View");
        return "result";
    }
    @RequestMapping(path = "/empform")
    public String getEmployeeForm(Model model){
        return "eform";
    }


}
