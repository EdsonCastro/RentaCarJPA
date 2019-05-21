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
	private Set<Car> car = new HashSet<>();
	
	
}
