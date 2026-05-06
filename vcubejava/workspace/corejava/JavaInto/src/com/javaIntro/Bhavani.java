package com.javaIntro;

import java.math.BigDecimal;

import java.math.BigInteger;

public class Bhavani {

	String str = "Jansi";// string literals-->SCP--->string constant pool
	String str1 = "Jansi";
	String str2 = new String("Jansi");// heap area

	BigInteger i = new BigInteger("723982529376546789087654329876589");
	BigInteger i2 = new BigInteger("72398252937654678908765432987654876543");
	
	
	
	BigDecimal d = new BigDecimal("921087654356789029876543456789.9876543");
	//BigDecimal d1 = new BigDecimal("921087654356789029876543456789.98765431234567890d");
	//BigDecimal d2= new BigDecimal("921087654356789029876543456789.9876543098765432f");
	//BigDecimal d3= new BigDecimal("9210876543567890298765434567899876543e");
	//BigDecimal d4 = new BigDecimal(127);
	//BigDecimal d5 = new BigDecimal("9210876543567890298765434567e");
	
	

	public static void main(String args[]) {
		Bhavani b = new Bhavani();

		System.out.println(b.i.add(b.i2));//add is a method and below also methods72398976920184055455554520641984753132
		System.out.println("----------------------------------------------");
		
		System.out.println(b.i.multiply(b.i2));//52415070284246243444280665321589962902304101226341206051169905220951827
		System.out.println("----------------------------------------------");
		
		System.out.println(b.i.divide(b.i2));//0
		System.out.println("----------------------------------------------");
		System.out.println(b.i.mod(b.i2));//723982529376546789087654329876589
		System.out.println("----------------------------------------------");
		System.out.println(b.i.add(b.i2));//72398976920184055455554520641984753132
		System.out.println("----------------------------------------------");
		
		System.out.println(b.i.subtract(b.i2));//-72397528955125302361976345333324999954
		System.out.println("----------------------------------------------");
		System.out.println(b.i2.subtract(b.i));//72397528955125302361976345333324999954

		
		
		System.out.println(b.d);//921087654356789029876543456789.9876543
		System.out.println("----------------------------------------------");
		System.out.println(b.str == b.str1);//true
		System.out.println("----------------------------------------------");
		System.out.println(b.str1 == b.str2);//false default
		
		
		
		
		//System.out.println(b.d.subtract(b.d3));
		//System.out.println(b.d4);
		//System.out.println(b.d4);
		//System.out.println(b.d3.divide(b.d5));
		//System.out.println(b.d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
