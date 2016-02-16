package com.mercadolibre.academy.hibernate.entity;

import java.io.Serializable;
import java.util.Set;

public class Aeropuerto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String ubicacion;

	private Set<Aerolinea> aerolineas;
	
	public Aeropuerto(){
		
	}
	
	public Aeropuerto(String nombre, int código){
		
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public Set<Aerolinea> getAerolineas() {
		return aerolineas;
	}

	public void setAerolineas(Set<Aerolinea> aerolineas) {
		this.aerolineas = aerolineas;
	}
	
}
