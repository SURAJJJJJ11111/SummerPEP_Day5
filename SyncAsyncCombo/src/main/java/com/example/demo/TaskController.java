package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/sync")
    public String sync() {
        return taskService.syncMethod();
    }

    @GetMapping("/async")
    public String async() {
        taskService.asyncMethod();
        return "Async Task Started";
    }
}