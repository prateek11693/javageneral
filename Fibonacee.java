package com.general.general;

public class Fibonacee {

	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < 8; i++) {
			int sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}

}
