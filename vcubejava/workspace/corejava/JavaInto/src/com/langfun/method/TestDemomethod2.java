package com.langfun.method;



public class TestDemomethod2 {
	
	static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
		
		
	}
	void sub(float a,float b,int c,double d) {
		System.out.println(a-b-c-d);
		
		
	}
	static void mul(float a,double b,long c,int d) {
		System.out.println(a*b*c*d);
		
		
	}
	static void div(int a,int b,float c,short f) {
		System.out.println(a%b%c%f);
		
		
	}
	static void mod(int a,int b,char c,boolean g) {
		System.out.println(a|b|c);
		
		
	}
	
    
	public static void main(String[] args) {
		TestDemomethod2 t1= new TestDemomethod2();
		
		
      System.out.println("MAin method started");
      add(102, 12560, 12345670,2345678);
      t1.sub(78,18.5f,45,1890.7d);
      mul(182.5F, 186345.56d, 1234567L,2);
      div(222,565,66.6f,(short)2);
      mod(8765, 4567, (char)66,true);
           }
}
