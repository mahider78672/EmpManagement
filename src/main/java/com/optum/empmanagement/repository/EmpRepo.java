package com.optum.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optum.empmanagement.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
