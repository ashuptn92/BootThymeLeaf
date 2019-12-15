package com.app.demo.service;
import java.util.List;
import com.app.demo.entity.Employee;

public interface IEmployeeService {
	public void saveEmployee(Employee emp);
	public void deleteEmployee(int empId);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployees();
}
