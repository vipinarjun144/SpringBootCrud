package com.vipin.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.vipin.demo.model.Employee;
import com.vipin.demo.service.IEmpService;

@Controller
public class EmployeeControler {
	
	@Autowired
	private IEmpService service;
	
	
	@GetMapping("/")
	public String viewHomepage(Model model) {
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("listofemployees", list);
		return "index";
	}
	
	@GetMapping("/showEmployeeForm")
	public String showEmployeeForm(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/updateEmployeeForm/{id}")
	public String updateEmployee(@PathVariable("id") long id,Model model) {
		
		Employee employee=service.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/delteEmployeeForm/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		service.deleteEmployee(id);
		return "redirect:/";
		
	}
	

}
