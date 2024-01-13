package com.restpkg1.rest1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="india_univ")
public class UnivEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String univ_name;
	
	public UnivEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UnivEntity(String univ_name) {
		super();
		this.univ_name = univ_name;
	}

	public String getUniv_name() {
		return univ_name;
	}
	
	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}

}
