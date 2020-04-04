package com;

public class Factorial {

	public static void main(String args[]) {
		int fact = 1, number = 3;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}
}
