package jabg;

public class TwoVehicles {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		int range1; 
		int range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range2=sportscar.fuelcap * sportscar.mpg;
		range1=minivan.fuelcap * minivan.mpg;
		
		System.out.println("Minivan can carry "+ minivan.passengers + "with a range of "+ range1);
		System.out.println("Sportscar can carry "+ sportscar.passengers + "with a range of "+range2);
		

	}

}
