package com.mercadolibre.academy.hibernate.entity;

import java.io.Serializable;
import java.util.Set;

public class Aerolinea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2718134001518471587L;

	private int id;
	
	private String nombre;
	
	private String origen;
	
	private Set<Vuelo> vuelos;
	
	public Aerolinea(){
		
	}
	
	public Aerolinea(String nombre){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	
}
