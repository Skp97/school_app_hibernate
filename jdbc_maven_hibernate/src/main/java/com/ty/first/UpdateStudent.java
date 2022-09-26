package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Student student1=new Student();
	student1.setRoll(8);
	student1.setName("Roshan");
	student1.setPercentage(9.00);
	entityTransaction.begin();
	entityManager.merge(student1);
	entityTransaction.commit();
	
	}
}
