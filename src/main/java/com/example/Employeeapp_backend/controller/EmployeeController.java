package com.example.Employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Addpage(){
        return "Welcome to my add page";
    }
    @GetMapping("/search")
    public String Searchpage(){
        return "Welcome to my search page";
    }
    @GetMapping("/edit")
    public String Editpage(){
        return "Welcome to my edit page";
    }
    @GetMapping("/viewall")
    public String ViewAll(){
        return "Welcome to my Viewall page";
    }
}
