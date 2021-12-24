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

import com.bocobi.back.models.ModePaiement;
import com.bocobi.back.repos.ModePaiementRepos;


@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class ModePaiementController {
	 /*@Autowired
		private ModePaiement modePaiementRepos;
		
		@GetMapping("/modePaiements")
		public List<ModePaiement> getModePaiement() {
			return modePaiementRepos.findAll();
		}
		
		@GetMapping("/modePaiements/{id}")
		public ModePaiement searchById(@PathVariable int id) {
			return modePaiementRepos.findById(id).orElse(null);
		}	
		
		@PostMapping("/modePaiement")
		public ModePaiement saveModePaiement(@RequestBody ModePaiement modePaiement) {
			return modePaiementRepos.save(modePaiement);
		}

		@DeleteMapping("/modePaiement/{id}")
		public String deleteForfait(@PathVariable int id) {
			modePaiementRepos.deleteById(id);
			return "Mode paiement suprimer avec success !!"+id;
		}	*/
}
