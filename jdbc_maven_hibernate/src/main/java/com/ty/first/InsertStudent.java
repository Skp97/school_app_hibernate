package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student1=new Student();
		student1.setRoll(1);
		student1.setName("Sourav");
		student1.setPercentage(90.00);
		Student student2=new Student();
		student2.setRoll(2);
		student2.setName("Anuj");
		student2.setPercentage(80.00);
		Student student3=new Student();
		student3.setRoll(3);
		student3.setName("Ishita");
		student3.setPercentage(85.00);
		Student student4=new Student();
		student4.setRoll(4);
		student4.setName("Nagaveni");
		student4.setPercentage(95.00);
		entityTransaction.begin();
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		
		entityTransaction.commit();
		
		
		
	}
}
