package com.mercadolibre.academy.hibernate.entity;

import java.io.Serializable;

public class Vuelo implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7781241616796237846L;
	
	private int id;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private Aerolinea aerolinea;
	
	public Vuelo(){
		
	}
	
	public Vuelo(Aeropuerto origen, Aeropuerto destino){
		this.origen=origen;
		this.destino=destino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	
}
