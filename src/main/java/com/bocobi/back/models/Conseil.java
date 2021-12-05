package com.bocobi.back.models;


import javax.persistence.*;


public class Conseil {
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String auteur;

	private String enonce;

	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
