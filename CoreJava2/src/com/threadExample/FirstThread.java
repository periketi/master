package com.threadExample;

class F1 extends Thread{
	
	public void run(){
	System.out.println("F1");
	}
}
class F2 extends Thread{
	
	public void run(){
	System.out.println("F2");
	}
}
public class FirstThread {

	public static void main(String[] args) {
		
		
		Thread t1 = new F1();
		Thread t2 = new F2();
		t1.start();
		t2.start();
	}

}
