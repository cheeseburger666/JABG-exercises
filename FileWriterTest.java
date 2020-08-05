/**
 * 
 */
package edu.neu.csye6200.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mac
 *
 */
public class FileWriterTest {
	/**
	 * The run method where I will do real file IO work
	 */
	public void run() {
		
		String base = "src/edu/neu/csye6200/io/";
		
		try {
			FileReader reader = new FileReader(base+"FileWriterTest.java");//open the file
			FileWriter writer = new FileWriter( base + "FWDuplicateX.txt");
			int inVal = reader.read();
			while (inVal >= 0) {
				
				System.out.print((char) inVal + "-");
				writer.write(" " + (char) inVal);
				
				inVal = reader.read() ;
			}
			
			reader.close();//close the open reader file  very important!!!
			writer.close();//close the open writer file   very important !!
		} catch (FileNotFoundException e) {// couldnt find the file
			
			e.printStackTrace();
		} catch (IOException e) { //couldnt read the file
			e.printStackTrace();
		}
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriterTest demo = new FileWriterTest();
		demo.run();
		

	}

}
