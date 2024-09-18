package com.example.hr.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hr.entity.Department;


@Repository
public interface DepartmentRepo extends JpaRepository<Department , Long> {

}
