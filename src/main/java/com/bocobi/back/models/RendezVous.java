package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class RendezVous {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Date daterdv;

	private Date heurerdv;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDaterdv() {
		return daterdv;
	}

	public void setDaterdv(Date daterdv) {
		this.daterdv = daterdv;
	}

	public Date getHeurerdv() {
		return heurerdv;
	}

	public void setHeurerdv(Date heurerdv) {
		this.heurerdv = heurerdv;
	}

}
