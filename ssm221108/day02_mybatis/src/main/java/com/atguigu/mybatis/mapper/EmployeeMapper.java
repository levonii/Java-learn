package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Employee;

public interface EmployeeMapper {

    /**
     * 查询
     */
    public Employee selectEmplById(int empId);

    public int insertEmployee(Employee employee);

    public void deleteEmployeeById(int empId);

    public void updateEmployeeById(Employee employee);
}
