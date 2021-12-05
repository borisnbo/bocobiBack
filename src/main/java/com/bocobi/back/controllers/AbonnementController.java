package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Abonnement;
import com.bocobi.back.repos.AbonnementRepos;

@RestController
@CrossOrigin
public class AbonnementController {

	private AbonnementRepos abonnementRepos;
	
	@GetMapping("bocobi/abonnements")
	public List<Abonnement> getAbonnements() {
		return abonnementRepos.findAll();
	}
	
	@GetMapping("bocobi/abonnement/{id}")
	public Abonnement searchById(@PathVariable int id) {
		return abonnementRepos.findById(id).orElse(null);
	}	
	
	@PostMapping("bocobi/abonnement")
	public Abonnement saveAbonnement(@RequestBody Abonnement abonnement) {
		return abonnementRepos.save(abonnement);
	}

	@DeleteMapping("bocobi/abonnement/{id}")
	public String deleteAbonnement(@PathVariable int id) {
		abonnementRepos.deleteById(id);
		return "Abonnement suprimer avec success !!"+id;
	}	
}
