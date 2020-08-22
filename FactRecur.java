package com.general.general;

public class FactRecur {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

	private static int factorial(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

}
