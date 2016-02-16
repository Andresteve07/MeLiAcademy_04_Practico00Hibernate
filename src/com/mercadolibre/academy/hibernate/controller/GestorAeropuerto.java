package com.mercadolibre.academy.hibernate.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mercadolibre.academy.hibernate.entity.Aeropuerto;

public class GestorAeropuerto {
private static SessionFactory fabrica;
	
	public GestorAeropuerto(SessionFactory fabrica){
		GestorAeropuerto.fabrica=fabrica;
	}

//	public int insertarAeropuerto(String dni, String nombre, String apellido) {
//		Session session = fabrica.openSession();
//		Transaction transaction = null;
//		int idAeropuerto = 0;
//		try {
//			transaction = session.beginTransaction();
//			Aeropuerto aeropuerto = new Aeropuerto(dni, nombre, apellido);
//			idAeropuerto = (int) session.save(Aeropuerto);
//			transaction.commit();
//		} catch (HibernateException hibernateException) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			hibernateException.printStackTrace();
//		} finally {
//			session.close();
//		}
//		return idAeropuerto;
//	}

	
	public int insertarAeropuerto(Aeropuerto aeropuerto) {

		Session session = fabrica.openSession();
		Transaction transaction = null;
		int idAeropuerto = 0;

		try {

			transaction = session.beginTransaction();
			idAeropuerto = (int) session.save(aeropuerto);
			transaction.commit();

		} catch (HibernateException hibernateException) {
			if (transaction != null) {
				transaction.rollback();

			}

			hibernateException.printStackTrace();
			System.out.println("ALGO PASO");

		} finally {

			session.close();

		}

		return idAeropuerto;

	}
	
	public void listarAeropuertos() {
		Session session = fabrica.openSession();
		Transaction transaction = null;//NO ES NECESARIA->LEER DOCS!!
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Aeropuerto> aeropuertos = session.createQuery("FROM Aeropuerto").list();
			for (Aeropuerto aeropuerto : aeropuertos) {
				System.out.println(aeropuerto.toString());
			}
			transaction.commit();
		} catch (HibernateException hibernateException) {
			if (transaction != null) {
				transaction.rollback();
			}	
			hibernateException.printStackTrace();
		} finally {
			session.close();
		}
	}

//	public void actualizarAeropuerto(int idAeropuerto, String dni, String nombre, String apellido) {
//		Session session = fabrica.openSession();
//		Transaction transaction = null;
//		try {
//			transaction = session.beginTransaction();
//			Aeropuerto Aeropuerto = (Aeropuerto) session.get(Aeropuerto.class, idAeropuerto);
//			Aeropuerto.setDni(dni);
//			Aeropuerto.setNombre(nombre);
//			Aeropuerto.setApellido(apellido);
//			session.update(Aeropuerto);
//			transaction.commit();
//		} catch (HibernateException hibernateException) {
//			if (transaction != null) {
//				transaction.rollback();
//			}	
//			hibernateException.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}

	public void borrarAeropuerto(int idAeropuerto) {
		Session session = fabrica.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Aeropuerto aeropuerto = (Aeropuerto) session.get(Aeropuerto.class, idAeropuerto);
			session.delete(aeropuerto);
			transaction.commit();
		} catch (HibernateException hibernateException) {
			if (transaction != null) {
				transaction.rollback();
			}	
			hibernateException.printStackTrace();
		} finally {
			session.close();
		}
	}
	
//	public static void main(String[] args) {
//		try {
//			fabrica = new Configuration().configure().buildSessionFactory();
//		} catch (Throwable exception) {
//			System.err.println("No se pudo crear el objeto SessionFactory." + exception);
//			throw new ExceptionInInitializerError(exception);
//		}
//		GestorAeropuerto managerAeropuerto = new GestorAeropuerto(fabrica);
//
//		int id1 = managerAeropuerto.insertarAeropuerto("dni1", "nombre1", "apellido1");
//		int id2 = managerAeropuerto.insertarAeropuerto("dni2", "nombre2", "apellido2");
//		managerAeropuerto.insertarAeropuerto("dni3", "nombre3", "apellido3");
//		managerAeropuerto.listarAeropuertos();
//		System.out.println("----");
//		managerAeropuerto.actualizarAeropuerto(id1, "xxxx", "xxxxxxx", "xxxxxxxxx");
//		managerAeropuerto.borrarAeropuerto(id2);;
//		managerAeropuerto.listarAeropuertos();
//	}
}
