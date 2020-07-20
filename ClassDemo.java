package jabg;

public class ClassDemo {

	public static void main(String[] args) {
	 
		//MyClass t1 = new MyClass();
		//MyClass t2 = new MyClass(); 
		
		
		MyClass t1 = new MyClass(10);// 在该程序中，构建函数定义了一个名为i的形参，它用于初始化实例变量x。
		MyClass t2 = new MyClass(88);// 执行时，88传递给了i，然后由i赋值给x。
		
		System.out.println (t1.x + " " + t2.x); // .x不能漏掉
		
		

	}

}
