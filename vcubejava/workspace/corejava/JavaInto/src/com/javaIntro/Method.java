package com.javaIntro;

import java.lang.foreign.ValueLayout;

public class Method {
	
	int i;
	long l;
	double d;
	float f;
	//instance variables we are declaring them to static variable where instance we can access  static area 
	//we cannot access instance in static area
	static void method1() {
		int i=21;
		long l=333333;
		double d=7489d;
		float f =123.09876f;
		//if we are assigning values to 
		
		System.out.println("Hello");
		//System.out.println("i value is :"+i);
		System.out.println(l);
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		
	}
	
	public static void main(String[] args) {
		
		
		method1();
	}

}
