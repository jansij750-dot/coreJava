package com.javaIntro;

public class TestliteralsDemo {
	
	
	
	
	public static void main() {
		TestliteralsDemo t=new TestliteralsDemo();
		String name="Jansi";
		
		
		//decimal literals
		int a=10;
		int b=223;
		int c=012367;
		//octal literal
		int a1=0152;
		int a2=0764;
		//int a3=098;//here the base number of octal literals are 0 to 7;
		
		
		//hexa decimal
		int a3=0x2334;
		int a4=0x12;
		
		
		//binary lierals (base value is 0 and 1)
		int a5=0b0101010;
		int a6=0b011011010;
		
		
		//floating point
		float f=19290;
		float f1=2398.5f;
		float f2=0x20b;
		float f3=065;
		
		//char literals
		char a7='A';
		//char a8=7234;//
		char a8=723;
		//char a8=7234
		//char a9='\udef0';//
		char a9='\uafed';
		
		//null literals 
		String s1=null;
		TestliteralsDemo t1=null;
		
		
		//double
		double d=05467.5d;
		double d1=0x4567d;
		double d2=42562d;
	//	double d3=0X7638.6d;//invalid hexa literal number
		
		
		
		
		
		System.out.println(name);
		
		
		//decimal literals
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		System.out.println(a3);
		
		
		
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		//System.out.println(d3);
		System.out.println(t);
		System.out.println(t.hashCode());
		int a0=0x54bedef2;
		System.out.println(a0);
		
		
	}

}
