package com.testutil;

public class AllCombinations {

	public static void main(String[] args) {
		addComb("123456");
	}

	public static void addComb(String str) {
		for (int i = str.length()-1; i >= 0; --i) {
			System.out.println(iter(i, str.length(), str));
		}
	}

	public static String iter(int start, int end, String str) {

		return str.substring(start, end);
	}

}
