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

import com.bocobi.back.models.RendezVous;
import com.bocobi.back.repos.RendezVousRepos;




@RestController
@RequestMapping("/bocobi")
@CrossOrigin	
public class RendezVousController {
	 @Autowired
		private RendezVousRepos rendezVousRepos;

		@GetMapping("/RendezVous")
		public List<RendezVous> getRendezVous() {
			return rendezVousRepos.findAll();
		}

		@GetMapping("/RendezVous/{id}")
		public RendezVous searchById(@PathVariable int id) {
			return rendezVousRepos.findById(id).orElse(null);
		}	

		@PostMapping("/RendezVous")
		public RendezVous  saveRendezVous(@RequestBody RendezVous rendezVous) {
			return rendezVousRepos.save(rendezVous);
		}

		@DeleteMapping("/RendezVous/{id}")
		public String deleteRendezVous(@PathVariable int id) {
			rendezVousRepos.deleteById(id);
			return "Rendez Vous supprimer avec success !!"+id;
		}
}
