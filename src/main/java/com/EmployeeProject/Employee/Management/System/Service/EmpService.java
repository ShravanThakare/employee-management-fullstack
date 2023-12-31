package com.EmployeeProject.Employee.Management.System.Service;

import java.util.List;

import com.EmployeeProject.Employee.Management.System.Entity.Employee;

public interface EmpService {

	public Employee saveEmp(Employee emp);
	
	
	public List<Employee> getAllEmp();
	
	
	public Employee getEmpbyId(int id);
	
	
	public boolean deleteEmp(int id);
	
}
