package com.general.general;

public class ShipOne {

	public static void main(String[] args) {
		
		Student stud1 = new Student(1,"prateek");
		Student stud2 = new Student(1,"prateek");
		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());
		System.out.println(stud1.equals(stud2));
		System.out.println(stud1);
		
		System.out.println(stud1.getClass());
	
		

	}

}
