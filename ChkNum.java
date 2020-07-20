package jabg;

public class ChkNum { //return true if x is even
	
	boolean isEven(int x) {
		// int range() 同理 只是此处括号里面加了形参
		if( (x%2)== 0 ) //x除2求余为零 则x为偶数
			return true;
		else 
			return false;
	}

}
