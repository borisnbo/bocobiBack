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

import com.bocobi.back.models.Medecin;
import com.bocobi.back.repos.MedecinRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class MedecinController {
	 @Autowired
	private MedecinRepos medecinRepos;

	@GetMapping("/Medecins")
	public List<Medecin> getExamen() {
		return medecinRepos.findAll();
	}

	@GetMapping("/Medecin/{id}")
	public Medecin searchById(@PathVariable int id) {
		return medecinRepos.findById(id).orElse(null);
	}	

	@PostMapping("/medecin")
	public Medecin saveAlerte(@RequestBody Medecin medecin) {
		return medecinRepos.save(medecin);
	}

	@DeleteMapping("/medecin/{id}")
	public String deleteMedecin(@PathVariable int id) {
		medecinRepos.deleteById(id);
		return "Medecin supprimer avec success !!"+id;
	}
}
