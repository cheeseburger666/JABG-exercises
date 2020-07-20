package jabg;

public class CompFuel {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		double gallons;
		int miles = 252;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		gallons = minivan.fuelneeded(miles); // 用dist也可以 距离
		
		System.out.println("To go "+ miles + " miles minivan needs "+ gallons + " gallons of fuel.");
		
		gallons = sportscar.fuelneeded(miles);
		
		System.out.println("To go "+ miles + " miles sportscar needs "+ gallons + " gallons of fuel.");
	
		
	}

}
