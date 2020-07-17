package jabg;

public class Guess {
	
	public static void main(String args[])
	throws java.io.IOException {
		
	 char ch, answer = 'K' ;
	 
	 System.out.println("I'm thinking of a letter between A and Z.");
	 //System.out.println() 输出信息后追加一个换行 System.out.print()输出之后不追加换行
     System.out.print("Can you guess it: ");
	 
	 ch = (char)System.in.read();
	 
	 if(ch == answer) System.out.println("Right!");
	 else { 
		 System.out.println("Sorry, you are wrong!");
		 if (ch<answer) System.out.println("too low");
		 else System.out.println("too high");
}
}
}

