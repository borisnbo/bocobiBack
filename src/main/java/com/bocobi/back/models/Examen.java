package com.bocobi.back.models;

import javax.persistence.*;

public class Examen {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String libelle;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
