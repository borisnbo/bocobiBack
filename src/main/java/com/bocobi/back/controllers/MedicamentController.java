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


import com.bocobi.back.models.Medicament;
import com.bocobi.back.repos.MedicamentRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin

public class MedicamentController {
	
	 /*@Autowired
		private MedicamentRepos medicamentRepos;

		@GetMapping("/Medicaments")
		public List<Medicament> getMedicament(){
			return medicamentRepos.findAll();
		}

		@GetMapping("/Medicament/{id}")
		public Medicament searchById(@PathVariable int id) {
			return medicamentRepos.findById(id).orElse(null);
		}	

		@PostMapping("/medicament")
		public Medicament saveMedicament(@RequestBody Medicament medicament) {
			return medicamentRepos.save(medicament);
		}

		@DeleteMapping("/medicament/{id}")
		public String deleteMedicament(@PathVariable int id) {
			medicamentRepos.deleteById(id);
			return "Medicament supprimer avec success !!"+id;
		}*/
}
