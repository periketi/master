package com.axis1;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		AdditionServiceLocator ser = new AdditionServiceLocator();
		
		Addition add = ser.getAddition();
		int sum = add.add(10, 20);
		System.out.println("sum===="+sum);
	}

}
