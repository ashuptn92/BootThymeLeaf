package com.app.demo.service;
import java.util.List;
import com.app.demo.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theName);
}
