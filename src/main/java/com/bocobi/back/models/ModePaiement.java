package com.bocobi.back.models;

import javax.persistence.*;

public class ModePaiement {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String libelle;

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

}
