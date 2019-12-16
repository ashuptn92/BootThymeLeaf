package com.app.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.demo.entity.Employee;
import com.app.demo.service.IEmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeRestController {
	private IEmployeeService service;
	
	@Autowired
	public EmployeeRestController(IEmployeeService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/list")
	public String listEmp(Model model) {
		List<Employee> listOfEmp = service.findAll();
		model.addAttribute("employees", listOfEmp);
		return "employees/list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		service.save(theEmployee);
		return "redirect:/employees/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model model) {
		Employee emp = service.findById(theId);
		model.addAttribute("employee", emp);
		return "";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		service.deleteById(theId);
		return "redirect:/employees/list";
	}
}
