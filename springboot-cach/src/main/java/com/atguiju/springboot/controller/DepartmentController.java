package com.atguiju.springboot.controller;

import com.atguiju.springboot.pojo.Department;
import com.atguiju.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping(value="/dep/{id}")
    public Department queryById(@PathVariable("id")Integer id){
        return departmentService.queryById(id);
    }
}
