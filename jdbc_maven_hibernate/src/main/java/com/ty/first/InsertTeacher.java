package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTeacher {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Teacher teacher1=new Teacher();
	teacher1.setEmail("pskp@gmail.com");
	teacher1.setPassword("skp123");
	teacher1.setName("Sourav Kashyap Panda");
	teacher1.setSubject("Math & Stats");
	Teacher teacher2=new Teacher();
	teacher2.setEmail("eshita@gmail.com");
	teacher2.setPassword("eshita123");
	teacher2.setName("Eshita Mohanta");
	teacher2.setSubject("Biology");
	Teacher teacher3=new Teacher();
	teacher3.setEmail("anuj@gmail.com");
	teacher3.setPassword("anuj123");
	teacher3.setName("Anuj Kumar");
	teacher3.setSubject("Physics");
	
	entityTransaction.begin();
	
	entityManager.persist(teacher1);
	entityManager.persist(teacher2);
	entityManager.persist(teacher3);
	
	entityTransaction.commit();
	
	
	
	
	
			
	}
}
