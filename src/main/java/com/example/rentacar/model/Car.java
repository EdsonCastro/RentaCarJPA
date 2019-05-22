package com.example.rentacar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CAR")
public class Car {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CAR")
	private Integer idCar;

	@Column(name = "CAR_LICENSE")
	private String carLicense;

	@Column(name = "NAME_CAR")
	private String carName;
		
	@ManyToOne
	//@Column(name = "OFFICE_CAR")
	private Office office;
	
	@ManyToOne
	//@Column(name = "RENT_CAR")
	private Rent rent;
	
	
}
