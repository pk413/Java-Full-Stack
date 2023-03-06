


	
		
		package org;

		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.boot.Metadata;
		import org.hibernate.boot.MetadataSources;
		import org.hibernate.boot.registry.StandardServiceRegistry;
		import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
		import org.hibernate.cfg.Configuration;

		public class InsertData {
			
			
		public static void main(String[] args) {		
				
			
				SessionFactory sessFact = HibernateUtil.getSessionFactory();		
				Session session = sessFact.getCurrentSession();		
				org.hibernate.Transaction tr = session.beginTransaction();
				
				
				
				Employee emp = new Employee();
				
				emp.setEmpName("Shashi");		
				emp.setEmpMobileNos("44444444");		
				emp.setEmpAddress("Pune - India");		
				session.save(emp);	
				
				tr.commit();
				System.out.println("Successfully inserted");
				session.close();
				sessFact.close();
			}
		


	

}
