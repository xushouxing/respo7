package com.atguiju.springboot.service;

import com.atguiju.springboot.mapper.EmployeeMapper;
import com.atguiju.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Cacheable(key="#id",unless = "#result==null")
    public Employee queryById(Integer id) {
        return employeeMapper.queryById(id);
    }
    @Transactional
    public void insert(Employee employee) {
        employeeMapper.insert(employee);
    }
    @Transactional
    @CacheEvict(cacheNames = "emp",key="#id",beforeInvocation = true)
    public void delete(Integer id) {
        employeeMapper.delete(id);
    }
    @Transactional
    @CachePut(cacheNames = "emp",key = "#employee.id")
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }
}
