package com.demo.test;
import com.demo.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.demo.bean.*;
import com.demo.dao.*;

public class TestMain {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1.Add Student");
			System.out.println("2.Display Student");
			System.out.println("3.Find Student By Name");
			choice  = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("1.Graduate Student");
				System.out.println("2.Master Student");
				
				int ch = sc.nextInt();
				service.addNewStudent(ch);
				break;
				
			case 2:
				
				List<Student> list = new ArrayList<>();
				
				list = service.display();
				System.out.println(list);
				break;
			
			case 3 :
				sc.nextLine();
				
				System.out.println("Enter name");
				String name = sc.nextLine();
				
				List<Student> newList = new ArrayList<>();
				
				newList = service.findByName(name);
				System.out.println(newList);
				break;
				
			}
		}while(choice != 4);
		

	}

}
