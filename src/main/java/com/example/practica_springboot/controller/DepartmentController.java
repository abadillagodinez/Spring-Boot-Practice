package com.example.practica_springboot.controller;


import com.example.practica_springboot.entity.Department;
import com.example.practica_springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.*;


@RestController
public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    // save operation
    @PostMapping("/departments")
    public Department saveDepartment(
            @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // update operation
    @PutMapping("/department/{id}")
    public Department updateDepartment(
            @RequestBody Department department,
            @PathVariable("id") Long departmentId
    ) {
        return departmentService.updateDepartment(department, departmentId);
    }

    // delete mapping
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(
            @PathVariable("id") Long departmentId
    ) {
       departmentService.deleteDepartmentById(departmentId);
       return "Deleted Successfully";
    }
}
