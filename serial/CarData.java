package edu.neu.csye6200.serial;

import java.io.Serializable;

public class CarData implements Serializable, Comparable<CarData>{
	/**
	 * now I am implementing the serialized mobile interface. 
	 * As soon as I do that the system as a whole,
	 * understands that my class can be read directly and pulled straight out.
	 * So I can use this to read and wirite to a desk. 
	 */
	private int iValue = 0;
	private double dValue = 0.1;
	private double dValue2 = 0.1;
	private String name;
	
	
    //constructor
	public CarData( int iValue, double dValue, double dValue2, String name) {
		this.iValue = iValue;
		this.dValue = dValue;
		this.dValue2 = dValue2;
		this.name = name;
		
	}
	
	/**
	 * This is comparable interface. 
	 * It is a contract that mandates that I have this compare to function.
	 * And I want to compare my class and get some other class that's being handed in.
	 */
	
	@Override  
	public int compareTo(CarData cd) {
		return name.compareTo(cd.name);//Is my class greater or less-than the other name
		
	}


	public int getiValue() {
		return iValue;
	}


	public void setiValue(int iValue) {
		this.iValue = iValue;
	}


	public double getdValue() {
		return dValue;
	}


	public void setdValue(double dValue) {
		this.dValue = dValue;
	}


	public double getdValue2() {
		return dValue2;
	}


	public void setdValue2(double dValue2) {
		this.dValue2 = dValue2;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
