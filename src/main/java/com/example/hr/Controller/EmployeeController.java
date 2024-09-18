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

import com.example.hr.entity.Employee;
import com.example.hr.reposatory.EmployeeRepo;
import com.example.hr.server.EmployeeServeses;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	
	@Autowired
	private EmployeeServeses employeeServeses ;
	
	
	@GetMapping("/id")
	public Employee findById(@PathVariable  Long id) {
		return employeeServeses.findById(id);
	}
	
	@GetMapping("/filter")
	public List<Employee> findByName(@PathVariable String name) {
		return employeeServeses.filter(name);
	}
	
	
	@PostMapping()
public long insert(@RequestBody Employee emp) {
		Employee inserted  = employeeServeses.insert(emp);
		return inserted.getId();
	}

	@PutMapping()
public Employee update(@RequestBody Employee emp) {
		return employeeServeses.update(emp);
}
	
	
	@GetMapping("/department/{demid}")
	public List<Employee> findByDepartmentId (@PathVariable Long demid){
		return employeeServeses.findByDepartmentId(demid);
	}
	
	
	
	

	
}
