package com.question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter Number of Students:");
		int number =sc.nextInt();
		
		Student stud[] = new Student[number];
	
		for(int i=0;i<number;i++) {
			Student s =new Student();
			System.out.println("Enter Roll Number:");
			int roll=sc.nextInt();
			s.setRoll(roll);
			
			System.out.println("Enter Name of Student:");
			String name =sc.next();
			s.setName(name);
			
			System.out.println("Enter Address:");
			String address=sc.next();
			s.setAddress(address);
			
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			s.setMarks(marks);
			
			
			stud[i]=s;
			
		}
		Student.PrintDetails(stud);
		Student.average(stud);
	}
	

}
