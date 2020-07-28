/**
 * 
 */
package edu.neu.csye6200.inherit;

import java.util.HashMap;

/**
 * @author mac
 *
 */
public class HashTest {
	
	HashMap<String, PetAnimal> myMap = new HashMap<String,PetAnimal>();
	
	//constructor
	HashTest(){
		myMap.put("Key-thor", new Dog("Thor"));
		myMap.put("Key-fenja", new Dog("Fenja"));
		
		if (myMap.containsKey("Key-thor"))
			System.out.println("We found Dog:" + myMap.get("Key-thor"));
			
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashTest ht = new HashTest();
		

	}

}
