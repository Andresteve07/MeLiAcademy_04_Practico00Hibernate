package com.mercadolibre.academy.hibernate.entity;

import java.io.Serializable;

public class Convenio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9100142859147010210L;
	private int id;
	private Aeropuerto aeropuerto;
	private Aerolinea aerolinea;
	
	
	public Convenio(){
		
	}
	
	public Convenio(Aeropuerto aeropuerto, Aerolinea aerolinea){
		this.aeropuerto=aeropuerto;
		this.aerolinea=aerolinea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	
}
