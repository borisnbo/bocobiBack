package com.bocobi.back.models;

import javax.persistence.*;

@Entity
@Table
public class CarnetElectronique {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	private Double taille;

    private Double poids;
    
	private String groupeSanguin;
    private Integer poulsParMinute;

    private Integer temperature;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTaille() {
		return taille;
	}

	public void setTaille(Double taille) {
		this.taille = taille;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public String getGroupeSanguin() {
		return groupeSanguin;
	}

	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}

	public Integer getPoulsParMinute() {
		return poulsParMinute;
	}

	public void setPoulsParMinute(Integer poulsParMinute) {
		this.poulsParMinute = poulsParMinute;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
    



}