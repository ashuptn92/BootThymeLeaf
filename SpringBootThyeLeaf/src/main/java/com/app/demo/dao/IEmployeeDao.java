package com.app.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.demo.entity.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>{
	// thats'it....No need to write ant code .. LOL ....  :)
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
