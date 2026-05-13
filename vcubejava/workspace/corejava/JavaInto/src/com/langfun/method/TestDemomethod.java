package com.langfun.method;



public class TestDemomethod {
	//without return type and without arguments
	static void display() {
		System.out.println("display method called");
	}

	public static void main(String[] args) {
		TestDemomethod t1=new TestDemomethod();
		System.out.println("main method called");
	    display();
	    t1.show();
		

	}
	void show() {
		System.out.println("show method called");
	}

}
