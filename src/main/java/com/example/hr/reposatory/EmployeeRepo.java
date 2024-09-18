package com.example.hr.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.hr.entity.Employee;



import com.example.hr.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee , Long> {

	
	// this is JpQl
    	@Query(value = "select emp from Employee emp where emp.name like :empName")
	    List<Employee> filter(@Param("empName") String name );
	
	
	// this is Sql Native
		@Query(value = "select * from hr-employee emp where emp.name like :empName", nativeQuery=true)
		List<Employee> filterNative(@Param("empName") String name );
	
	
	    List<Employee> findByDepartmentId (Long demid);
	    
	   @Query(value = "select emp from Employee emp join emp.department dem where dem.id = :demid")
	    List<Employee> findByDepartment (Long demid);
	    
	    
}
