package edu.neu.csye6200.inherit;

import java.util.ArrayList;

/**
 * A Kennel to hold petAnimals
 * 
 * 
 * @author Xinyi
 */
public class Kennel {
	
	private ArrayList<PetAnimal> petList = new ArrayList<PetAnimal>();
	
	
	//constructor - set up the world
	public Kennel() {
		
	}
    
	/**
	 * A run method to start execution of the Kennel
	 */
	public void run() {
		// Do work here
		//Dog d1 = new Dog("Fido");
		//Dog d2 = new Dog("Thor");
		
		petList.add(new PetAnimal());
		petList.add(new Dog("Fido"));//Thor and Fido isn't with us anymore 
		petList.add(new Dog("Thor"));
		petList.add(new Dog("Fenja"));
		petList.add(new Dog("Lucky"));
		
	}
	/**
	 * Add a PetAnimal
	 * @param pAnimal the pet to add
	 */
	public void add(PetAnimal pAnimal) {
		petList.add(pAnimal);
	}
	
	/**
	 * List all pets to the console
	 */
	public void list() {//list doesn't have to do anything, I just made routine and I am going to call it doesn't work.
		for(PetAnimal pet : petList ) {
			System.out.println("Pet:"+pet);
			
		}
		
	}
	
	public static void main(String[] args) {
		Kennel ken1 = new Kennel() ;
		ken1.add(new Dog("name"));
		ken1.run();//add values and do processing
		ken1.list();//list the contents
		System.out.println("We are done.");
		
		
		
		
	

	}

}
