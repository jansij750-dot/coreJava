package com.javaIntro;




public class TestDemo3 {
	
	static String name;
	static int age=12;
	{
		age++;
	}
	static void display() {
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
	public static void main(String args[]) {
		
		
		System.out.println("main method started");
		TestDemo3 j=new TestDemo3();
		j.name="jansi";
		
		
		display();
		
		
		
		System.out.println("----------------------------");
		TestDemo3 j1=new TestDemo3();
		j1.name="jansi";
		display();
		
		
		System.out.println("--------------------");
		TestDemo3 j2=new TestDemo3();
		j2.name="sanjana";
		display();
		
		
		System.out.println("----------------------");
		TestDemo3 j3=new TestDemo3();
		j3.name="bhavani";
		display();
		
	}

}
