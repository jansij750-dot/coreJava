package com.langfun.method;


public class TestArthematicmethod {
	
	static int a=10;
	static float f=15.0f;//here it is a double value we can convert double to float by representing it as "f" and explicity type casting
	static double d=1938d;
	static long l=1287l;
	static void arthematic() {
		System.out.println(a+f+d+l);
		System.out.println(a-f-d-l);
		System.out.println(d*f*a*l);
		
		System.out.println(l%d%f%a);
		System.out.println(f/l/d/a);
	}

	public static void main(String[] args) {
	//	TestArthematicmethod t1=new TestArthematicmethod ();
		//t1.l=18312l;
		
		arthematic();
	}

}
