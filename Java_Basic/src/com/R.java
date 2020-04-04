package com;

public class R {

	public static void main(String args[]) {

		R r = new R();
		System.out.println(r.reverse("RAVISHANKAR PERIKETI"));
	}

	public String reverse(String s) {
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		return rev;

	}
}