package jabg;

public class ForVar {

	public static void main(String[] args) {
		int sum = 0;
		int fact = 1;
		for( int i=1; i<=5; i++) {
			sum += i;
			fact *= i;//阶乘
			
		}
		System.out.println("Sum is "+sum);
		System.out.println("Factorial is "+fact);
		
			
	}

}
