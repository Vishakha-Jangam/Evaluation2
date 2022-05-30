package com.question2;

public class Student {

	private int roll;
	private String name;
	private String address;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static void PrintDetails(Student stud[]) {
		for(int i=0;i<stud.length;i++) {
		System.out.println("Roll No:"+stud[i].getRoll());
		System.out.println("Name:"+stud[i].getName());
		System.out.println("Address:"+stud[i].getAddress());
		System.out.println("Marks:"+stud[i].getMarks());
		System.out.println("--------------------------------");
		}
		
	}
	
	public static void average(Student s[]) {
		int sum=0;
		for(Student st:s) {
			 sum=sum+st.getMarks();
		}
		
		int avg=sum/s.length;
		System.out.println("Average Marks:"+avg);
	}
}
