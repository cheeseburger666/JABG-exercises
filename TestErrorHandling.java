package edu.neu.csye6200.error;

import java.io.IOException;

public class TestErrorHandling {

	
	/**
	 * Do work here
	 */
	public void run() {
		testCatch();
	}
	
	public void testCatch() {
		
		try {
			testError(1);//Statement under test
			//testError(6);//Statement under test
		} catch (IOException e) {
			System.out.println("IO Error caught");
			e.printStackTrace();//print the program stack
		} catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();//print the program stack
		} finally {
			System.out.println("Final cleanup!");
		}
	}
	
	
	
	/**
	 * Method that can produce an ERROR (exception)
	 * @param val
	 * @throws IOException 
	 */
	public void testError(int val) throws IOException {
		if (val > 5)
			throw new IOException("This is an IO Error");
		
		if (val < 2 )
			throw new IllegalArgumentException("This is an IA Exception");
	}
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestErrorHandling teh = new TestErrorHandling();
		teh.run(); //call the run method

	}

}
