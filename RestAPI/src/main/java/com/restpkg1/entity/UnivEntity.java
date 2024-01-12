package com.restpkg1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="universities")
public class UnivEntity {
	@Id
	@GeneratedValue
	private int univ_id;
	private String univ_name;
	private String univ_address;
	
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
	public String getUniv_address() {
		return univ_address;
	}
	public void setUniv_address(String univ_address) {
		this.univ_address = univ_address;
	}
	
	

}
