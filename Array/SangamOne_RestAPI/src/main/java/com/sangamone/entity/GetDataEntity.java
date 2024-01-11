package com.sangamone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="names")
public class GetDataEntity {
	@Id
	@GeneratedValue
	private String names;

	public String getNames() {
		return names;
	}
}
