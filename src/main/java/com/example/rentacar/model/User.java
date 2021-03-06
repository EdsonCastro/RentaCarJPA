package com.example.rentacar.model;

import java.util.Set;
import java.util.TreeSet;
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
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_USER")
	private Integer idUser;
	
	@Column(name = "NAME_USER")
	private String nameUser;
	
	@OneToMany(mappedBy = "user")
	//@Column(name = "USER_RENT")
	private Set<Rent> rents = new TreeSet<>();
	
}
