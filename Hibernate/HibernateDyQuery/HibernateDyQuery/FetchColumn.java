package com;

import javax.persistence.*; 
import java.util.*;

public class FetchColumn {
	
	public static void main( String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Query query = em.createQuery("Select s.s_name from StudentEntity s"); // static query
		
		
		
		@SuppressWarnings("unchecked")
		
		List<String> list =query.getResultList();
		
		System.out.println("Student Name :"); 
		
		for(String s:list) {
		System.out.println(s);
		}
		
		em.close();
		emf.close();
		
		}

}
