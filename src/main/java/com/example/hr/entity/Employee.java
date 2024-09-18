package com.example.hr.entity;

import com.example.hr.entity.Department;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "hr_employee")
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "employee-id")
	private long id ;
	
	@Column(name = "employee-name")
	private String name ;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	private Double salary;
	
	@ManyToOne
	@JoinColumn(name = "department-id")
	@JsonIgnore
	private Department department; 
	
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
