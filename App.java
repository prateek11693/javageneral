package com.general.general;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Array arr = new Array(3);
		arr.print();
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.insert(50);
		arr.insert(60);
		arr.insert(70);
		arr.insert(80);
		System.out.println(arr.indexOf(20));
		System.out.println(arr.indexOf(200));
		arr.removeAt(0);
		arr.removeAt(7);

		arr.print();
		System.out.println("Hello World!");
		
		LinkedList list=new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(5));
		System.out.println(list.contains(100));
		list.print();
		list.removeFirst();
		list.print();
		list.removeLast();
		list.print();
		list.addFirst(100);
		list.print();
		System.out.println(list.size());
		
	}
}
