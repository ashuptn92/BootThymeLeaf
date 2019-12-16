package com.app.demo.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.demo.dao.IEmployeeDao;
import com.app.demo.entity.Employee;
import com.app.demo.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao dao;
	
	@Autowired
	public EmployeeServiceImpl(IEmployeeDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Employee> findAll() {
		return dao.findByEmpName();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = dao.findById(theId);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		dao.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		dao.deleteById(theId);
	}

	@Override
	public List<Employee> searchBy(String theName) {
		
		List<Employee> results = null;
		
		if (theName != null && (theName.trim().length() > 0)) {
			results = dao.findByEmpName(theName);
		}
		else {
			results = findAll();
		}
		
		return results;
	}

}