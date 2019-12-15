package com.app.demo.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.app.demo.dao.IEmployeeDao;
import com.app.demo.entity.Employee;
import com.app.demo.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao dao;
	
	public EmployeeServiceImpl(IEmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAllByOrderByLastNameAsc();
	}
}
