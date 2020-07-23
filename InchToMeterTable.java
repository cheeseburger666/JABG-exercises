package assignments;

public class InchToMeterTable {

	public static void main(String[] args) {
		
		double inches;
		double meters;
		int counter;
		
		counter = 0;
		for(inches = 1; inches <= 100; inches++) {
			
			meters = inches / 39.37;
			System.out.println(inches+"inches is "+ meters + " meters.");
			
			counter ++;
			if (counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
		

	}

}
