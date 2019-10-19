package com.atguiju.springboot.mapper;

import com.atguiju.springboot.pojo.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department queryById(Integer id);
    @Insert("insert into department(id,departmentName)values(#{id},#{departmentName})")
    public Department insert(Department department);
}
