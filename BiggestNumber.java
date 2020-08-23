package com.general.general;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 50, 40, 80, 90, 20 };
		System.out.println(arr.toString());

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		int biggestNumber = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > biggestNumber) {
				biggestNumber = arr[i];
			}
		}
		System.out.println("BiggestNumber is  " + biggestNumber);
	}
}
