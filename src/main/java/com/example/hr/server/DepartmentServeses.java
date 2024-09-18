package com.example.hr.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hr.entity.Department;
import com.example.hr.entity.Employee;
import com.example.hr.reposatory.DepartmentRepo;
import com.example.hr.reposatory.EmployeeRepo;

@Service
public class DepartmentServeses {

	@Autowired
	private DepartmentRepo departmentRepo ;
	
	public Department findById(Long id) {
		
		return departmentRepo.findById(id).orElseThrow();
	}
	
     public Department insert(Department dem) {
		
		return departmentRepo.save(dem);
	}

     public Department update(Department dem) {
	Department current = departmentRepo.findById(dem.getId()).get();
	current.setName(dem.getName());

	
	return departmentRepo.save(current);
}

	public List<Department> findAll() {
		
		return departmentRepo.findAll();
	}
     
     
     
     
     
     
     
     
}
