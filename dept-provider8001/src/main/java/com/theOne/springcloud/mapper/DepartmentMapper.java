package com.theOne.springcloud.mapper;

import com.theOne.springcloud.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper{

    public List<Department> getDepartments();

    public Department getDepartmentById(@Param("id")int id);

}

