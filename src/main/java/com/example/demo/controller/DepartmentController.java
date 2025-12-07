package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{dno}")
    public Department getDepartmentById(@PathVariable int dno) {
        return service.getDepartmentById(dno);
    }

    @PostMapping
    public String addDepartment(@RequestBody Department dept) {
        service.addDepartment(dept);
        return "Department added successfully!";
    }

    @PutMapping("/{dno}")
    public String updateDepartment(@PathVariable int dno, @RequestBody Department dept) {
        dept.setDno(dno);
        service.updateDepartment(dept);
        return "Department updated successfully!";
    }

    @DeleteMapping("/{dno}")
    public String deleteDepartment(@PathVariable int dno) {
        service.deleteDepartment(dno);
        return "Department deleted successfully!";
    }
}
