package com.bocobi.back.models;

import javax.persistence.*;

public class Medecin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String grade;

	private String specialite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	//@OneToMany(mappedBy ="medecin")
	//@JoinColumn(name = "idMedecin")
	//private ArrayList<Teleconsultation> teleconsultations;


}