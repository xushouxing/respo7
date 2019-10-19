package com.atguiju.springboot.service;

import com.atguiju.springboot.mapper.DepartmentMapper;
import com.atguiju.springboot.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper  departmentMapper;

    public Department queryById(Integer id) {
        return departmentMapper.queryById(id);
    }
}
