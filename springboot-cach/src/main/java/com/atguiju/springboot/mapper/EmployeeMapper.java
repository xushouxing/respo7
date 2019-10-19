package com.atguiju.springboot.mapper;

import com.atguiju.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    public Employee queryById(Integer id);
    @Select("select * from employee where lastName=#{lastName}")
    public Employee queryByLastName(String lastName);
    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public void update(Employee employee);
    @Delete("delete from employee where id=#{id}")
    public void delete(Integer id);
    @Insert("insert into employee(id,lastName,email,gender,d_id) values(#{id},#{lastName},#{email},#{gender},#{dId})")
    public void insert(Employee employee);
}
