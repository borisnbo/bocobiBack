package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Role;


public interface RoleRepos extends JpaRepository<Role, Integer> {

	Role findByName(String rolename);

}
