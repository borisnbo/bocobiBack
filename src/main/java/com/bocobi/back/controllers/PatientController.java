package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.User;
import com.bocobi.back.repos.UserRepos;



@RestController
@CrossOrigin
public class PatientController {
	
	@Autowired
	private UserRepos patientRepos;
	
	@GetMapping("bocobi/patients")
	public List<User> getPatients() {
		return patientRepos.findAll();
	}
	
	@GetMapping("bocobi/patient/{id}")
	public User searchById(@PathVariable int id) {
		return patientRepos.findById(id).orElse(null);
	}	
	
	@PostMapping("bocobi/patient")
	public User savePatient(@RequestBody User patient) {
		return patientRepos.save(patient);
	}

	@DeleteMapping("bocobi/patient/{id}")
	public String deletePatient(@PathVariable int id) {
		patientRepos.deleteById(id);
		return "Patient suprimer avec success !!"+id;
	}	
}
