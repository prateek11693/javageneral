package com.general.general;

import java.util.ArrayList;
import java.util.Collections;

public class Sortt {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(40);	
//		list.add(30);
//		list.add(20);
//		list.add(10);
//Collections.sort(list);
		
		ArrayList<Persons> list = new ArrayList();
		list.add(new Persons("P",10));
		list.add(new Persons("A",20));
		Collections.sort(list);
System.out.println(list);
list.forEach(System.out::println);
	}

}
