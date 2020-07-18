package jabg;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		
		for(x=0;x<6;x++) {
		
			if(x==1)//这里不能加分号
			System.out.println("x is one");
		
			else if (x==2)
				System.out.println("x is two");
		
			else if (x==3)
				System.out.println("x is three");
		
			else if (x==4)
				System.out.println("x is four");
		
			else System.out.println("x is not between 1 and 4");
		
		}
		
		
	}

}

/** 在控制选择过程的条件不依赖于一个值的时候应该使用if-else-if语句
 * 如 if(x>10)
 * else if (y!=10)
 * else if (!done)
 * 这组语句不可以用switch语句重写，因为三个条件都包含不同的变量，而且是不同的类型。 
 * 什么变量可以控制switch？
 * 当测试浮点值或者switch表达式中不可使用的对象时，也需要使用if-else-if语句。
 * 
 * 
 * 1.switch语句由于它独特的case值判断方式，使其执行效率更高，而if else语句呢，则由于判断机制，导致效率稍慢。
 * 2.到底使用哪一个选择语句，和当前的代码环境有关，如果是范围取值，则使用if else语句更为快捷；
 * 如果是确定取值，则使用switch更是一个不错的选择。
 **/

