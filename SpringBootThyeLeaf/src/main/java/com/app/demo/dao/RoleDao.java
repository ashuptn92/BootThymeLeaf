package com.app.demo.dao;
import com.app.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
