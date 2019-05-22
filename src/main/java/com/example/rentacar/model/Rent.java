package com.example.rentacar.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RENT")
public class Rent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_RENT")
	private Integer idRent;
	
	@Column(name = "START_RENT")
	private Date start;
	
	@Column(name = "END_RENT")
	private Date end;
	
	@ManyToOne
	@Column(name = "USER_RENT")
	private User user;

	@ManyToOne
	@Column(name = "OFFICE_RENT")
	private Office office;	
	
	@OneToMany(mappedBy = "rent")
	@Column(name = "CARS_RENT")
	private Set<Car> carsRent = new HashSet<>();

}
