package com.javaIntro;

public class Bank {
	
	
	static short acc_no=101;
	long  balance_amount;
	String name;
	
	
	{
		acc_no++;//increment to increase the numbers 
	}
	
	void display() {
		System.out.println(name);
		System.out.println(balance_amount);
		System.out.println(acc_no);
		
	}
	
	
	
	public static void main(String args[]) {
		
		Bank b=new Bank();
		b.name="Bhavani";
		b.balance_amount=826392L;
		b.display();
		
		
		Bank b1=new Bank();
		b1.name="Jansi";
		b1.balance_amount=10929l;
		b1.display();
		
		
		
		Bank b2=new Bank();
		b2.name="Shravani";
		b2.balance_amount=109756l;
		b2.display();
		
		Bank b3=new Bank();
		b3.name="Sanjana";
		b3.balance_amount=109296l;
		b3.display();
		
		
		Bank b4=new Bank();
		b4.name="Ammulu";
		b4.balance_amount=109297l;
		b4.display();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
