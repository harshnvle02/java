package com.demo.service;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.*;
import com.demo.bean.*;


public class StudentServiceImpl implements StudentService {

	StudentDao dao;
	
	
	public StudentServiceImpl() {
		super();
		
		dao = new StudentDaoImpl();
		
	}


	public void addNewStudent(int ch) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		
		System.out.println("Enter subject");
		String sub = sc.nextLine();
		
		System.out.println("Enter marks:");
		int m1 = sc.nextInt();
		
		if(ch == 1)
		{
			sc.nextLine();
			
			System.out.println("Enter special subject");
			String sub1 = sc.nextLine();
			
			System.out.println("Enter Special Sub Marks");
			int marks = sc.nextInt();
			  
			Student s = new GarduateStudent(id,name,sub,m1,sub1,marks);
			
			dao.addStudent(s);
				
		}
		if(ch == 2)
		{
			sc.nextLine();
			
			System.out.println("Enter thesis sub");
			String sub2 = sc.nextLine();
			
			System.out.println("Enter marks");
			int marks2 = sc.nextInt();
			
			Student s2 = new MasterStudent(id,name,sub,m1,sub2,marks2);
			
			dao.addStudent(s2);
			
		}	
		
	}


	@Override
	public List<Student> display() {
		
		return dao.display();

	}


	@Override
	public List<Student> findByName(String name) {
		
		return dao.findByName(name);
	}

}

