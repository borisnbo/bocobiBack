package com.bocobi.back.models;

import javax.persistence.*;

public class Alerte {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String type;

    private String code;
    
	private String enonce;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

}