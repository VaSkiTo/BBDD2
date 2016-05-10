package bd2.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bd2.model.Documento;

public class Queries {
	
	private static SessionFactory sessions;
	
	public static List<Documento> query_1(){
		
		// Listar los nombres de todos los doc
		
		System.out.println("Listar los nombres de todos los doc");
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate/hibernate.cfg.xml");
		sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		
		Query query = session.createQuery("from Documento");
		
		return query.list();
		
	}

}
