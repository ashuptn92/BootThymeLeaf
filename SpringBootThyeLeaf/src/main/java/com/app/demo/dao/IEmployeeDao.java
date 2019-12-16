package com.app.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.demo.entity.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer>{
	// thats'it....No need to write ant code .. LOL ....  :)
	
	public List<Employee> findByEmpName();
	
	// search by name
	public List<Employee> findByEmpName(String name);
}
