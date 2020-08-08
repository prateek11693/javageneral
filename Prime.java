package com.general.general;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("enter the number");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("NotPrime");
	}

}
