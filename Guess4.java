package jabg;

public class Guess4 {

	public static void main(String[] args)
	throws java.io.IOException {
		
		char ch, ignore, answer = 'K';
		
		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.println("Can you guess it:");
			ch =(char)System.in.read();
			
			do {ignore = (char)System.in.read();
			}while (ignore != '\n');
			/**控制台输入是行缓冲的，在传送字符前必须按下ENTER，按下ENTER会生成一个回车符和换行符。
			*这些字符还保存在输入缓冲中。而且如果在ENTER键之前按下许多键，它们也会保存在输入缓冲中。
			*通过不断读入输入内容，直到行的末尾，这个循环排除了这些字符。
			*/
			
			if(ch == answer)
				System.out.println("Right!");
			else {
				System.out.print("Sorry,you are ");
				if(ch<answer) 
					System.out.println("too low");
				else 
					System.out.println("too high");
				System.out.println("Try again!\n");
			}
		}while(answer != ch);
		
		
	}

}
