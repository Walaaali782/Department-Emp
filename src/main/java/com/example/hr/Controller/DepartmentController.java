package com.example.hr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr.entity.Department;
import com.example.hr.entity.Employee;
import com.example.hr.reposatory.EmployeeRepo;
import com.example.hr.server.DepartmentServeses;
import com.example.hr.server.EmployeeServeses;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	
	
	@Autowired
	private DepartmentServeses departmentServeses ;
	
	
	@GetMapping("/id")
	public Department findById(@PathVariable  Long id) {
		return departmentServeses.findById(id);
	}
	

	@PostMapping()
public Department insert(@RequestBody Department dem) {
		
		return departmentServeses.insert(dem);
	}
	@PutMapping()
public Department update(@RequestBody Department dem) {

	return departmentServeses.update(dem);
}
	
	
	
	
	
	@GetMapping()
	public List<Department> findAll() {
		
		return departmentServeses.findAll();
	}
	
	
	
	
}
