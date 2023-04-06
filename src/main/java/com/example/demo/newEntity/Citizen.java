package com.example.demo.newEntity;

import org.springframework.data.annotation.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity

public class Citizen {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;
	
	int VaccinationCenterId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return VaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		VaccinationCenterId = vaccinationCenterId;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", VaccinationCenterId=" + VaccinationCenterId + "]";
	}

	public Citizen(int id, String name, int vaccinationCenterId) {
		
		this.id = id;
		this.name = name;
		VaccinationCenterId = vaccinationCenterId;
	}
	
	public Citizen() {
	
	

}
}