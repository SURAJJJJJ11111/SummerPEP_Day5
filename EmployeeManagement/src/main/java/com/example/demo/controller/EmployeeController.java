package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/add")
    public String addEmployee(Model model) {

        model.addAttribute("employee", new Employee());

        return "add";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee) {

        service.save(employee);

        return "continue";
    }
    
    @GetMapping("/display")
    public String display(Model model) {

        model.addAttribute("employees", service.getAll());

        return "display";
    }
}