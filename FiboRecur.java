package com.general.general;

public class FiboRecur {

	public static void main(String[] args) {

		System.out.println(fibo(4));

	}

	private static Integer fibo(Integer number) {

		if (number <1)
			return 0;
		else if (number == 1 || number == 2)
			return fibo(number - 1);
		else
			return fibo(number - 1) + fibo(number - 2);
	}

}
