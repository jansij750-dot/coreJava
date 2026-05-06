package com.javaIntro;

public class Bankdetails {
	
	static long acc_no=2982001L;
	String empolee_name;
	//{
	//	acc_no++;
	//}
	void show() {
		System.out.println("main method is started");
		System.out.println(acc_no++);//here the acc++ is that where the ++operator when we used it in the pre and the account number which we had assigned it we print the number from there like 101 we asssigned and 102 it starts from 
		//System.out.println(++acc_no);
		System.out.println(empolee_name);
	}
	
	public static void main(String args[]) {
		Bankdetails b=new Bankdetails();
		b.empolee_name="bhavani";
	
		b.show();
		
		System.out.println("---------------------");
	     Bankdetails b1=new Bankdetails();
	     b1.empolee_name="maggie";
	     b1.show();
	     System.out.println("---------------------");
	     Bankdetails b2=new Bankdetails();
	     b2.empolee_name="navya";
	     b2.show();
	     
	     System.out.println("---------------------");
	     Bankdetails b3=new Bankdetails();
	     b3.empolee_name="swathi";
	     b3.show();
	     System.out.println("---------------------");
	     Bankdetails b4=new Bankdetails();
	     b4.empolee_name="sushma";
	     b4.show();
	     System.out.println("---------------------");
	     Bankdetails b5=new Bankdetails();
	     b5.empolee_name="kalyani";
	     b5.show();
		
		
	}

}
