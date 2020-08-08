package com.general.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		// Stream<String> books=Stream.of("Invalid","HORROR");
		//
		// Optional book = books.filter(b->b=="HORROR").findAny();
		// System.out.println(book.get());
		//
		// List<Integer> list = Stream.of(1,2,3,4,5,5,5,5).collect(Collectors.toList());
		// HashSet<Integer> set = new HashSet<>();
		//
		// for(Integer l:list)
		// {
		// set.add(l);
		// }
		// set.stream().forEach(System.out::println);
		//
		//
		//
		// int[] arr= {10,30,20,37,273,62,74,8,92,35};
		//
		//// for(int i=1;i<arr.length;i++) {
		//// for(int j=0;j<arr.length-1;j++) {
		////
		//// if(arr[j+1]<arr[j]) {
		//// int temp=arr[j];
		//// arr[j]=arr[j+1];
		//// arr[j+1]=temp;
		//// }
		//// }
		//// }
		// //Arrays.sort(arr);
		//
		// for(int i=0;i<arr.length-1;i++) {
		// if(arr[i]>arr[i+1]) {
		// int temp=arr[i];
		// arr[i]=arr[i+1];
		// arr[i+1]=temp;
		// i=-1;
		// }
		// }
		//
		// for(int k:arr) {
		// System.out.println(k);
		// }
		//
		// System.out.println(arr[arr.length-5]);
		//
		// StringBuilder str= new StringBuilder("prateek");
		//
		// System.out.println(str.append(" gupta"));
		//
		// String str1="chandra";
		// str1+=" Shekhar";
		//
		// System.out.println(str1);

		// String str = "prateek";
		// HashMap<Character,Integer> map = new HashMap<>();
		//
		// for(int i=0;i<str.length();i++) {
		// char ch = str.charAt(i);
		// Integer value = map.get(ch);
		//
		// value=0 ? map.put(ch, value++):map.put(ch, new Integer(1));
		//
		//
		//
		// }
		// ************************************************************************************************
		// System.out.println("print");
		//
		/*
		 * Student s1 = new Student(1,"Prateek"); Student s2 = new Student(1,"Prateek");
		 * // // String str1="Prateek"; String str2="Prateek";
		 * 
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(str1); System.out.println(s1==s2);
		 * 
		 * 
		 * System.out.println(s1.equals(s2));
		 * 
		 * //by overriding equals method it returns true
		 * 
		 * System.out.println(str1==str1); System.out.println(str1.equals(str2));
		 */

		/*
		 * Demo a = (int b)->System.out.println("prateek" + b);
		 * 
		 * // Interface1 intfa =new ImplementedClass(); // intfa.inplementedmethoid();
		 * a.demo(2);
		 * 
		 * 
		 * }
		 * 
		 * interface Demo {
		 * 
		 * void demo(int a);
		 * 
		 * 
		 * }
		 */

		System.out.println("prateek");

		String str = "a green apple";

		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			Integer value = m.get(c);

			if (value == null) {
				m.put(c, new Integer(1));
			} else {
				m.put(c, value + 1);

			}
		}

		for (Character k : m.keySet()) {
			if (m.get(k) == 1) {
				System.out.println(k);
				break;
			}
		}
		for (Entry<Character, Integer> item : m.entrySet()) {
			System.out.println(item);
		}

		/*
		 * String[] strArr = str.replaceAll("123","").split(""); for(String c: strArr) {
		 * System.out.println(c); }
		 * System.out.println(Arrays.toString(strArr).toString());
		 */

	}
}
