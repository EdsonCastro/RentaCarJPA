package com.example.rentacar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "CAR_REGISTRATION")
	private Integer carRegistration;
	
	@ManyToOne
	private Office office;
	
	@ManyToOne
	private User user;
	
	
}
