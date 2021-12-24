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

import com.bocobi.back.models.Examen;
import com.bocobi.back.repos.ExamenRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class ExamenController {
	 @Autowired
		private ExamenRepos examenRepos;
		
		@GetMapping("/examens")
		public List<Examen> getExamen() {
			return examenRepos.findAll();
		}
		
		@GetMapping("/examen/{id}")
		public Examen searchById(@PathVariable int id) {
			return examenRepos.findById(id).orElse(null);
		}	
		
		@PostMapping("/examen")
		public Examen saveAlerte(@RequestBody Examen examen) {
			return examenRepos.save(examen);
		}

		@DeleteMapping("/examen/{id}")
		public String deleteExamen(@PathVariable int id) {
			examenRepos.deleteById(id);
			return "Examen suprimer avec success !!"+id;
		}	

}
