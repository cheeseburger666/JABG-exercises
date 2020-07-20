package jabg;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21); //creat a Vehicle object called minivan
		Vehicle sportscar = new Vehicle(2,14,12);//creat a Vehicle object called sportscar
		
		double gallons;
		int dist = 252;
		
		
		//int range;
		
		//minivan.passengers = 7;
		//minivan.fuelcap = 16;
		//minivan.mpg = 21;
		
		//range = minivan.fuelcap * minivan.mpg;
		//System.out.println("Minivan can carry "+minivan.passengers + " with a range of "+ range);
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go "+dist+"miles minivan needs "+ gallons + " gallons of fuel.");
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go "+dist+"miles sportscar needs "+ gallons + " gallons of fuel.");
		
		
		
		
	}

}
