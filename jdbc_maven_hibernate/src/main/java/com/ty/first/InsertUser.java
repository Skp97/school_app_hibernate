package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUser {
	public static void main(String[] args) {
		UserAnnotations user=new UserAnnotations();
		user.setEmail("anuj@gmail.com");
		user.setPassword("anuj123");
		user.setPhone(86501);
		user.setGender("Male");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		
	}
}
