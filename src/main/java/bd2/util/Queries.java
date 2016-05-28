package bd2.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bd2.model.Documento;
import bd2.model.Moderador;

public class Queries {
	
	private static SessionFactory sessions;
	
	public static List<Documento> query_1(){
		
		// Listar los nombres de todos los doc
		
		Transaction tx = null;
		
		System.out.println("Listar los nombres de todos los doc");
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate/hibernate.cfg.xml");
		sessions = cfg.buildSessionFactory();
        
        Session session = sessions.openSession();
        
        tx = session.beginTransaction();
        tx.setTimeout(5);
        
		Query query = session.createQuery("from Documento");
		
		tx.commit();
		
		return query.list();
		
	}
	
	public static List<Moderador> query_2(){
		
		// Listar los emails de los moderadores que hayan evaluado traducciones al ingles
		
		Transaction tx = null;
		
		System.out.println("Listar los emails de los moderadores que hayan evaluado traducciones al ingles");
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate/hibernate.cfg.xml");
		sessions = cfg.buildSessionFactory();
        
        Session session = sessions.openSession();
        
        tx = session.beginTransaction();
        tx.setTimeout(5);
        
		Query query = session.createQuery("SELECT E FROM Evaluacion as E WHERE E.traduccion.idioma.nombre = 'Ingles'");
		
		tx.commit();
		
		return query.list();
		
	}

}
