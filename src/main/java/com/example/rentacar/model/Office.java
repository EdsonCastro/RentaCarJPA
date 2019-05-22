package com.example.rentacar.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "OFFICE")
public class Office {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_OFFICE")
	private Integer idOffice;
	
	@Column(name = "NAME_OFFICE")
	private String nameOffice;
	
	
	@OneToMany(mappedBy = "office")
	@Column(name = "RENT_OFFICE")
	private Set<Car> rents = new HashSet<>();
	
	@OneToMany(mappedBy = "office")
	@Column(name = "CARS_OFFICE")
	private Set<Car> carsOffice = new HashSet<>();
	
}
