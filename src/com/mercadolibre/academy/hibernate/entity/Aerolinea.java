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
	
	private String paisOrigen;
	
	private Set<Vuelo> vuelos;
	
	private Aeropuerto aeropuerto;
	
	public void agregarVuelo(Vuelo vuelo) throws Exception{
		if(this.vuelos.contains(vuelo))
			throw new Exception("Vuelo repetido en aerolinea"+ this.nombre);
		this.vuelos.add(vuelo);
	}
	
	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public Aerolinea(){
		
	}
	
	public Aerolinea(String nombre, String paisOrigen){
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
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

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	
}
