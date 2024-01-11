package com.sangamone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="top_univ")
public class UnivEntity {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int univ_id;
	
	private String univ_name;

	public int getUniv_id() {
		return univ_id;
	}

	public void setUniv_id(int univ_id) {
		this.univ_id = univ_id;
	}

	public String getUniv_name() {
		return univ_name;
	}

	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
		

}
