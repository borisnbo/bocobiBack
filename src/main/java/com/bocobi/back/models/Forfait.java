package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class Forfait {
   
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String libelle;
    
	private long prix;

    private String periode;
    
	private long duree;

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

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public long getDuree() {
		return duree;
	}

	public void setDuree(long duree) {
		this.duree = duree;
	}


}