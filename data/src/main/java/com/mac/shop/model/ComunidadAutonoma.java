package com.mac.shop.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table (name="CA", schema="macShop2015")
public class ComunidadAutonoma {
	
	public ComunidadAutonoma(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public ComunidadAutonoma() {
		super();
	}
	
	@Id
	@Column(name="idCA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 100, unique=true)
	private String nombre;
	
	@OneToMany(mappedBy="comunidadAutonoma")
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private Set<Provincia> provincia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
