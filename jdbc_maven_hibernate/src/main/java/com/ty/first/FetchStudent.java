package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student student=entityManager.find(Student.class, 1);
		
		System.out.println("Roll num: "+student.getRoll());
		System.out.println("Name is: "+student.getName());
		System.out.println("Percentage is: "+student.getPercentage());
		
		Student student2=entityManager.find(Student.class, 5);
		
	}
}
