package com.atguiju.springboot.controller;

import com.atguiju.springboot.pojo.Employee;
import com.atguiju.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("emp/{id}")
    public Employee queryBiId(@PathVariable("id")Integer id){
        Employee employee = employeeService.queryById(id);
        return employee;
    }
    @GetMapping("/emp/insert")
    public void insert(Employee employee){
        employeeService.insert(employee);
    }
    @GetMapping("/emp/del/{id}")
    public void delete(@PathVariable("id") Integer id){
        employeeService.delete(id);
    }
    @GetMapping("emp")
    public void update(Employee employee){
        employeeService.update(employee);
    }
}
