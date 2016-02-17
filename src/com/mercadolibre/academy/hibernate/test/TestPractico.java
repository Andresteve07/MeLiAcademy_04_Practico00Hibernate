package com.mercadolibre.academy.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mercadolibre.academy.hibernate.controller.GestorAeropuerto;
import com.mercadolibre.academy.hibernate.entity.Aerolinea;
import com.mercadolibre.academy.hibernate.entity.Aeropuerto;
import com.mercadolibre.academy.hibernate.entity.Vuelo;

public class TestPractico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
			Aeropuerto aerop1 = new Aeropuerto("La Guardia", "Los Ángeles");
			Aeropuerto aerop2 = new Aeropuerto("Eseiza", "Buenos Aires");
			Aerolinea aeroli1 = new Aerolinea("American Airlines", "Estados Unidos");
			Aerolinea aeroli2 = new Aerolinea("Fly Emirates", "Arabia Saudita");
			Set<Aerolinea> aerolineas = new HashSet<Aerolinea>();
			aerolineas.add(aeroli1);
			aerolineas.add(aeroli2);
			for(Aerolinea aero : aerolineas){
				aero.setVuelos(new HashSet<Vuelo>());
				aero.agregarVuelo(new Vuelo(aerop1,aerop2));
				aero.agregarVuelo(new Vuelo(aerop1,aerop2));
				aero.agregarVuelo(new Vuelo(aerop1,aerop2));
			}
				
			aerop1.setAerolineas(aerolineas);
			aerop2.setAerolineas(aerolineas);
			GestorAeropuerto gaerp = new GestorAeropuerto(fabrica);
			gaerp.insertarAeropuerto(aerop1);
		}
		catch(Exception exc){
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
	}

}
