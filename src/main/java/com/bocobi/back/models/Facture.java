package com.bocobi.back.models;

import javax.persistence.*;

public class Facture {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String reference;
	
	@OneToOne
	private Teleconsultation teleconsultation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Teleconsultation getTeleconsultation() {
		return teleconsultation;
	}

	public void setTeleconsultation(Teleconsultation teleconsultation) {
		this.teleconsultation = teleconsultation;
	}

}
