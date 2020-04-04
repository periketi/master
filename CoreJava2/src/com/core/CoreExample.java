package com.core;

public class CoreExample {

	public static void main(String[] args) {
		System.out.println(test());

	}

	public static String test() {

		String[] strArray = new String[10];
		strArray[0] = "RAVI0";
		strArray[1] = "RAVI1";
		strArray[2] = "RAVI2";
		strArray[3] = "RAVI3";
		strArray[4] = "RAVI4";
		strArray[5] = "RAVI5";
		strArray[6] = "RAVI6";
		strArray[7] = "RAVI7";
		strArray[8] = "RAVI8";
		strArray[9] = "RAVI9";
		String str1="";
		for (String str : strArray) {
			str1 = str1.concat("::").concat(str);
		}
		return (str1);

	}
}
