package com.vipin.demo.service;

import java.util.List;

import com.vipin.demo.model.Employee;

public interface IEmpService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployee(long id);

}
