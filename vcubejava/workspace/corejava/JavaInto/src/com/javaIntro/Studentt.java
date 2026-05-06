package com.javaIntro;


public class Studentt {
	
	byte b;
	int i;
	short s;
	long l;
	void show() {
	   b=10;
	   i=22;
	   s=27;
	   l=81389L;
	
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
	}
	public static void main(String args[]) {
		Studentt s=new Studentt();
		s.show();
	}
	
	
	
	
	

}
