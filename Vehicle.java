package jabg;

public class Vehicle {

	int passengers;
	int fuelcap;
	int mpg;
	
	//void range() {//range()方法包含在Vehicle类中！！ void可以用return结束
		//System.out.println("Range is "+ fuelcap * mpg );//直接调用不需要使用点运算符“."
	
	//通过添加一个在创建对象时自动初始化passengers、fuelcap和mpg域的构造函数来改善Vehicle类
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	//改善完毕
	
	int range() {
    	return (int) mpg * fuelcap; //加了个（int）试一下有什么不同
	}
	double fuelneeded(int miles) {
		return (double) miles / mpg; //新方法：计算给定距离所需的耗油总量
	
	}
}


