package edu.neu.csye6200.inherit;

public class Dog extends PetAnimal {
	
	
	/**
	 * Constructor
	 */
	Dog(){
		System.out.println("Dog Constructor");
		
		setName("Unknown dog");
	}
	
	
    Dog(String name){
    	System.out.println("Dog Constructor name");
		setName(name);
	}
  
    
    
    
	/**
	 * Make the dog bark and limited to barking only for the dog
	 */
	void bark() {
		System.out.println("Bark");
	}
	
	/**
	 * Override the toString method
	 */
	public String toString() {
		return("Dog name:"+getName() + "Id: " +getId());
	}
    
	public static void main(String[] args) {
		PetAnimal pet = new PetAnimal();
		pet.walk();
		//there is no 'bark' 
		System.out.println("My pet is " + pet);
		
		Dog dog = new Dog("Thor");//it did the constructor of pet animal first because dog inherits from pet animal
		dog.walk();
		dog.bark();
		System.out.println("My dog is named " + dog.getName() + 
				"id: " + dog.getId());	
		
	}
}
