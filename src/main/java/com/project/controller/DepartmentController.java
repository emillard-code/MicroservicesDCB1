package com.project.controller;

import com.project.model.Department;
import com.project.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        log.info("Slf4j: Inside saveDepartment method of DepartmentController");
        return  departmentService.saveDepartment(department);

    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {

        log.info("Slf4j: Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);

    }

}