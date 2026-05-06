package com.javaIntro;

public class Testdemo2 {
	
	static void method() {
		System.out.println("---------------------");
		String name ="jansi";
		int age=22;
		System.out.println(name);
		System.out.println(age);
		
		
	}	
	
		static void method1() {
			String name ="Bhavani";
			int age=23;
			System.out.println("---------------------");
			System.out.println(name);
			System.out.println(age);
			method();
	//	method();
		//if we call the method here then the method wont execute 
		}
	
	public static void main(String args[]) {
		System.out.println("main method ended");
		method1();
		//method();
	//here we need to call the method() to call the static method 
		//at first the main method as per we written the program
		//after the execution of the staement then it will check is there anthing to execute by the JVM 
		//then if any method present then it will execute that method if we call it after the statement in the main method 
	
	
	
	}
	
	
	
	
	
	
	

}
