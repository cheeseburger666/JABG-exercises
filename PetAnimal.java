package edu.neu.csye6200.inherit;

public class PetAnimal {
	
	
	
	private int id; //and id value for each pet animal
	private static int idCounter = 0; //Initial value is zero 
	//every time use a constructor in increments the number so everyone who builds a driver class gets one of those unique ID values, it is get automatically generated.
	
	
	private int age = 0; //years of age
	private String name = ""; 

	
	
	
	/**
	 * Constructor
	 */
	PetAnimal(){
		System.out.println("PetAnimal Constructor");
		name = "unknown";
		id = idCounter++;// id=1
		//id = ++idCounter； //id=2
		
	}

	void walk() {
		System.out.println("Walk");
	}


/**
 * only allow retrieval of the ID
 * @return
 */
	public int getId() {
		return id;
	}// I dont want to set the identifier. The class is going to do that on its own so I can only set a get.



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	public String toString (){
		return("PetAnimal name:"+name + "Id: " +id);
		
	}

	
	
}
