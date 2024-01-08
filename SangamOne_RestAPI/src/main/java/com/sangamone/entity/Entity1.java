package com.sangamone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="holidays")
public class Entity1 {
	@Id
	@GeneratedValue
	private String names;
	
	public String getHolidays() {
		return names;
	}

	public void setHolidays(String holidays) {
		this.names = holidays;
	}
	

}
