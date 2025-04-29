package com.example.practica_springboot.service;

// import necessary classes
import com.example.practica_springboot.entity.Department;

import java.util.List;

public interface DepartmentService {

    // declare method to save a dept
    Department saveDepartment(Department department);

    // declare method to fetch a list of departments
    List<Department> fetchDepartmentList();

    // declare method for the update operation
    Department updateDepartment(Department department, Long departmentId);

    // declare method for the delete operation
    void deleteDepartmentById(Long departmentId);
}
