package edu.neu.csye6200.boat;

public class StrExample {
	
	//Constructor
	StrExample (){
		//String quote = "The universe is full of stars.";
		String quote = "Mars";
	//this code appears going to get executed,and this is where my programs really running at the moment in the constructor.
	    
		int len = quote.length();
		int starIndex = quote.indexOf("star");
		
		if(quote.equalsIgnoreCase("Mars"))
			System.out.println("We hava a match");
		
		System.out.println("A quote is "+ quote);
	
	}
	public static void main(String [] args) {
		StrExample strEx = new StrExample();
		
		
	}

}
