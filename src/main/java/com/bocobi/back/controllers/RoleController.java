package com.bocobi.back.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Role;
import com.bocobi.back.repos.RoleRepos;



@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class RoleController {
	 @Autowired
		private RoleRepos roleRepos;

		@GetMapping("/roles")
		public List<Role> getRole(){
			return  roleRepos.findAll();
		}

		@GetMapping("/role/{id}")
		public Role searchById(@PathVariable int id) {
			return  roleRepos.findById(id).orElse(null);
		}	

		@PostMapping("/Role")
		public  Role  saveRole(@RequestBody  Role role) {
			return  roleRepos.save(role);
		}

		@DeleteMapping("/Role/{id}")
		public String deleteRole(@PathVariable int id) {
			 roleRepos.deleteById(id);
			return "role supprimer avec success !!"+id;
		}
}
