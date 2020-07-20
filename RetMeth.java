package jabg;

public class RetMeth {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		int range1;
		int range2;
		
		minivan.passengers = 7;
		minivan.fuelcap =16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2 ;
		sportscar.fuelcap = 14 ;
		sportscar.mpg = 12 ;
		
		range1 = minivan.range();// 重点！ 将返回值赋给变量
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry "+ minivan.passengers + " with range of "+ range1 + " Miles ");
		System.out.println("Sportscar can carry "+ sportscar.passengers + " with range of "+ range2 + " Miles ");
		}

}
