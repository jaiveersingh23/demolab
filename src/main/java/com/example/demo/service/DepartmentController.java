package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Department getDepartmentById(int dno) {
        return repository.findById(dno);
    }

    public int addDepartment(Department dept) {
        return repository.save(dept);
    }

    public int updateDepartment(Department dept) {
        return repository.update(dept);
    }

    public int deleteDepartment(int dno) {
        return repository.delete(dno);
    }
}