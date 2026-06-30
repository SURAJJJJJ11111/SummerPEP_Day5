package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void save(Employee emp) {

        switch(emp.getDesignation().toLowerCase()) {

        case "programmer":
            emp.setSalary(25000);
            break;

        case "manager":
            emp.setSalary(30000);
            break;

        case "tester":
            emp.setSalary(20000);
            break;

        default:
            throw new RuntimeException("Invalid Designation");
        }

        repository.save(emp);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public void raiseSalary(Integer id,double amount) {

        Employee emp=repository.findById(id).orElse(null);

        if(emp!=null) {

            emp.setSalary(emp.getSalary()+amount);

            repository.save(emp);
        }

    }

}