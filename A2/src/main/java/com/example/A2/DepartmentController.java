package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
     @Autowired
     private DepartmentService departmentService;
     @GetMapping("/doctors")
     public List<Department> getAllDepartments(){
    	 return departmentService.getAllDepartments();
     }
     @GetMapping("doctors/{id}")
    	 public Department getDepartmentById(@PathVariable Long id) {
    		 return departmentService.getDepartmentById(id);
    	 }
     }

