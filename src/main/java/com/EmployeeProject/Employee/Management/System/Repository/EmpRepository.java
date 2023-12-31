package com.EmployeeProject.Employee.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeProject.Employee.Management.System.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
