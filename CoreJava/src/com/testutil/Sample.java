package com.testutil;

import java.io.FileInputStream;

public class Sample {

	public static void main(String[] args) throws Exception {

		System.out.println("Hello".toLowerCase()=="hello");
		System.out.println("he"+"llo" =="hello");
		System.out.println("spac---"+"Hello".hashCode());
		System.out.println("spac---"+"Hello".toLowerCase().hashCode());
		FileInputStream input = new FileInputStream("C://eclipseworkspace//CoreJava//src//com//testutil//ravi.txt");
		System.out.println("input.read()----"+input.read());
	}

}
