package com.managment.palladium.controllers;

import com.managment.palladium.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${version}")
    private String ver;

    @Autowired
    EmployeeService empService;

    @GetMapping("/")
    public String displayHome(Model model){

        model.addAttribute("versionNumber", ver);

        return "index";
    }



}
