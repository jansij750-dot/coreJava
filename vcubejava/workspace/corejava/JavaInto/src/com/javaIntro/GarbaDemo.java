package com.javaIntro;

public class GarbaDemo {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	   super.finalize();
	}

	public static void main(String[] args) {
		//before nullyfing
		GarbaDemo gc1=new GarbaDemo();
	gc1=null;//after giving a null value to the gc1 then the address of the gc1 is allocating to the gc2 and gc2 value to the gc3
		GarbaDemo gc2=new GarbaDemo();
		GarbaDemo gc3=new GarbaDemo();
		//gc1=null;
		System.out.println(gc1);
		
		System.out.println(gc2);
		System.out.println(gc3);
		//reassigning the value as gc3=gc2
		
		
		
		
		
		
		
		
	System.out.println(gc1);
		
		System.out.println(gc2);
		System.out.println(gc3);
		
		
		
		
	System.out.println(gc1);
		
		System.out.println(gc2);
		System.out.println(gc3);
		
		
		
	System.out.println(gc1);
		
		System.out.println(gc2);
		System.out.println(gc3);
		

	}

}
