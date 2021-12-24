package com.bocobi.back.services;

import java.util.List;

import com.bocobi.back.models.Role;
import com.bocobi.back.models.User;


public interface UserService {

	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String rolename);
	List<User> getUsers();
	
}
