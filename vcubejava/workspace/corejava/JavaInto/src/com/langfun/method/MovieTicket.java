package com.langfun.method;



public class MovieTicket {
	
	
	static String  theaterName="AMB";
	String MovieName;
	
	int normalTicketPrice;
	int VipTicketPrice;
	
	int Numberoftickets=3;
	
	long PhoneNumber;
	String seatingarea;
	String languageName;
	void show() {
		int normaltotalbill=Numberoftickets*normalTicketPrice;
		int viptotalbill=Numberoftickets*VipTicketPrice;
		//int GST=50;
		

        System.out.println("theatrname:"+theaterName);
        System.out.println("movie name:"+MovieName);
     //   System.out.println("TicketPrice:"+TicketPrice);
        System.out.println("Phonenumber:"+PhoneNumber);
        System.out.println("seatingarea:"+seatingarea);
        System.out.println("LanguageName:"+languageName);
        System.out.println(normaltotalbill);
        System.out.println(viptotalbill);
	
	}
	
	
	
	public static void main(String[] args) {
		MovieTicket m1=new MovieTicket();
		m1.MovieName="Salaar";
		m1.normalTicketPrice=250;
		
		m1.seatingarea="H20,H19,H18";
		m1.PhoneNumber=78876543l;
		m1.languageName="Telugu";
		m1.show();
		
		MovieTicket m2=new MovieTicket();
		m2.MovieName="Salaar";
		m2.VipTicketPrice=450;
		m2.seatingarea="Q19,Q18,Q17";
		m2.PhoneNumber=7823456789l;
		m2.languageName="Telugu";
		m2.show();
				
		
		

	}

}
