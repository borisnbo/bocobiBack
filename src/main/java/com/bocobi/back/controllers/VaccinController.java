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

import com.bocobi.back.models.Vaccin;
import com.bocobi.back.repos.VaccinRepos;




@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class VaccinController {
	@Autowired
	private VaccinRepos vaccinRepos;
	
	@GetMapping("/vaccins")
	public List<Vaccin> getVaccin() {
		return vaccinRepos.findAll();
	}
	
	@GetMapping("/vaccin/{id}")
	public Vaccin searchById(@PathVariable int id) {
		return vaccinRepos.findById(id).orElse(null);
	}	
	
	@PostMapping("/vaccin")
	public Vaccin saveVaccin(@RequestBody Vaccin vaccin) {
		return vaccinRepos.save(vaccin);
	}

	@DeleteMapping("/vaccin/{id}")
	public String deleteVaccin(@PathVariable int id) {
		vaccinRepos.deleteById(id);
		return "vaccin supprimer avec success !!"+id;
	}
}
