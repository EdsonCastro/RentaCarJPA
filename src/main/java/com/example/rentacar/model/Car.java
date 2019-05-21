package com.example.rentacar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {
	@Id	
	@Column(name = "CAR_REGISTRATION")
	private Integer carRegistration;
	
	@ManyToOne
	private Office office;
}
