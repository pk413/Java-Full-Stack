package com;

import javax.persistence.*;
import java.util.*;
import com.StudentEntity;

public class FetchColumn {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" ); 
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin( );
		
		Query query = em.createNamedQuery("find name");
		
		
		@SuppressWarnings("unchecked") List<StudentEntity> list =query.getResultList(); 
		System.out.println("Student Name :");
		
		for(StudentEntity s:list) {
			System.out.println(s.getS_name());
			}
			em.close();
			emf.close();
		
		
		
		
	}

}
