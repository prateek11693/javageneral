package com.general.general;

public class InterviewOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean one=new Boolean("123");
		Boolean three=new Boolean("123");
		System.out.println(one);	//false
		Boolean two=new Boolean("ABC");
		System.out.println(two);	//false
		System.out.println(one.equals(two));	//true
		System.out.println(one.equals(three));	//true
		
		

	}

}
