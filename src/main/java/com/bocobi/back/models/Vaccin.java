package com.bocobi.back.models;

import javax.persistence.*;

public class Vaccin {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String libelle;

	private String maladie;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMaladie() {
		return maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    
}
