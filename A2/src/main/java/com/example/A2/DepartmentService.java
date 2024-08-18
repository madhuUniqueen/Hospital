package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
      @Autowired
      private DepartmentRepository departmentRepository;
      public List<Department> getAllDepartments(){
    	  return departmentRepository.findAll();
      }
      public Department getDepartmentById(Long id) {
    	  return departmentRepository.findById(id).orElse(null);
      }
}
