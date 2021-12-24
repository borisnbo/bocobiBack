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

import com.bocobi.back.models.Facture;
import com.bocobi.back.repos.FactureRepos;



@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class FactureController {
	 @Autowired
		private FactureRepos factureRepos;
		
		@GetMapping("/factures")
		public List<Facture> getExamen() {
			return factureRepos.findAll();
		}
		
		@GetMapping("/facture/{id}")
		public Facture searchById(@PathVariable int id) {
			return factureRepos.findById(id).orElse(null);
		}	
		
		@PostMapping("/facture")
		public Facture saveAlerte(@RequestBody Facture facture) {
			return factureRepos.save(facture);
		}

		@DeleteMapping("/facture/{id}")
		public String deleteExamen(@PathVariable int id) {
			factureRepos.deleteById(id);
			return "Facture supprimer avec success !!"+id;
		}	

}
