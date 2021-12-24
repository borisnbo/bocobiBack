package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class Teleconsultation {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date jour;

	private Date heure;
/*
	@OneToOne(mappedBy="teleconsultation")
	@JoinColumn(name="idFacture")
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name= "idPatient")
	private Patient patient;
	
	@ManyToOne  
	@JoinColumn(name="idMedecin")
	private Medecin medecin;
    */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}
}
