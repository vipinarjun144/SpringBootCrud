package com.vipin.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vipin.demo.model.Employee;
import com.vipin.demo.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements IEmpService {
	
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=repository.findAll();
		
		return list;
	}

	@Override
	public void saveEmployee(Employee employee) {
		repository.save(employee);
		
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional=repository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			 employee=optional.get();
		}
		else {
			throw new RuntimeException("Employee not found by id  "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployee(long id) {
		repository.deleteById(id);
		
		
	}

}
