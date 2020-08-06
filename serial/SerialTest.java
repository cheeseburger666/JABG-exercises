package edu.neu.csye6200.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class SerialTest {

	public SerialTest() {
	
	}	
		
    public void streamOut (CarData cardata, String filename) {
		
    	try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//write the object
			
			oos.writeObject(cardata);//write the CarData to the file
			
			//close the file
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    public CarData streamIn(String filename) {
    	CarData cardata = null;
		FileInputStream fis;
		try {
			fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//Read the object
			//Object obj = ois.readObject();
			//if(obj instanceof CarData)
			//	cardata =  (CarData) ois.readObject();
			
			cardata =  (CarData) ois.readObject();
			
			ois.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
    	return cardata;
    	
    }
    
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		String fName = "auto.data";
		SerialTest serTest = new SerialTest();
		
		CarData carData = new CarData(1,1.5,2.5, "Ford");
		serTest.streamOut(carData, fName);//check to make sure it works
		
		
		CarData carData2 = serTest.streamIn(fName);
		System.out.println("CarData2 is "+ carData2.getName());
		
		//Let's sort some cars
		
		ArrayList<CarData> carList = new ArrayList < CarData >();
		
		carList.add(new CarData(1,1.5,2.5, "Ford"));
		carList.add(new CarData(1,1.5,2.5, "Chevy"));
		carList.add(new CarData(1,1.5,2.5, "Land Rover"));
		carList.add(new CarData(1,1.5,2.5, "Toyota"));
		carList.add(new CarData(1,1.5,2.5, "Mercedes"));
		carList.add(new CarData(1,1.5,2.5, "Tesla"));
		carList.add(new CarData(1,1.5,2.5, "Lexus"));
		
		Collections.sort(carList);
		
		System.out.println("Our list is sorted.");
		
		}

}
