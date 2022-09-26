package com.ty.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Teacher teacher=entityManager.find(Teacher.class, "pskp@gmail.com");
		if(teacher!=null) {
		System.out.println(teacher.getEmail());
		System.out.println(teacher.getPassword());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSubject());
		}
		else {
			System.out.println("Null row");
		}
		
	}
}
