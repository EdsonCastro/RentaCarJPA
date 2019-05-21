package com.example.rentacar.model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

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
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_USER")
	private Integer idUser;
	
	@Column(name = "NAME_USER")
	private String nameUser;
	
	@ManyToOne
	private Office office;
	
	@OneToMany(mappedBy = "office")
	private Set<Car> cars = new HashSet<>();
	
	private TreeMap<Integer, Integer> Rent = new TreeMap<Integer, Integer>();

	public TreeMap<Integer, Integer> getRent() {
		return Rent;
	}

	public void setRent(TreeMap<Integer, Integer> rent) {
		Rent = rent;
	}	
	
}
