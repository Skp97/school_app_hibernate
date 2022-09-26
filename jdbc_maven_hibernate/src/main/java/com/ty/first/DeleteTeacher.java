package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteTeacher {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Teacher teacher=entityManager.find(Teacher.class, "anuj@gmail.com");
	if(teacher!=null) {
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
	}
	else {
		System.out.println("wrong data");
	}
}
}
