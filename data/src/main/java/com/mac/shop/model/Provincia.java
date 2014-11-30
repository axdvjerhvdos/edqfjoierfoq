package com.mac.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (schema="macShop2015")
public class Provincia {
	
	@Id
	@Column(name="idProvincia")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 100, unique=true)
	private String nombre;

	@ManyToOne
	@JoinColumn(name="CA_idCA")
	private ComunidadAutonoma comunidadAutonoma;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
	}

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

	public ComunidadAutonoma getComunidadAutonoma() {
		return comunidadAutonoma;
	}

	public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	
}
