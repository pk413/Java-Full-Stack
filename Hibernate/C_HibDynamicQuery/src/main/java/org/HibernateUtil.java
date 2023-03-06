package org;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	private HibernateUtil() {
	}

	public synchronized static SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new RuntimeException("Clone not Supported **********  !");
	}

}

	
	/*
	private static final SessionFactory sessionFactory;		 	
	 static {
	 try {		 			
			  Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			  StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
			  sb.applySettings(cfg.getProperties()); 
			  StandardServiceRegistry standardserviceregistry = sb.build(); 
			   sessionFactory = cfg.buildSessionFactory(standardserviceregistry);			
	 }catch (Throwable th) {
		 System.err.println(th);
	  throw new ExceptionInInitializerError(th);
	 }
	}
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
*/
