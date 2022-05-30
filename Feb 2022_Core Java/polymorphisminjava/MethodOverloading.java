package polymorphisminjava;

public class MethodOverloading {
	
	public void method_A()
	{
		System.out.println("without parameters");
	}
	
	public void method_A(int a)
	{
		System.out.println("with parameter : "+a);
	}
	
	public void method_A(int a, int b)
	{
		System.out.println("with 2 parameter : "+a+" "+b);
	}
	
	public void method_A(double a)
	{
		System.out.println("with double data type : "+a);
	}
	
	public boolean method_A(boolean a)
	{
		System.out.println("with boolean data type :"+a);
		return a;
	}
	
	public float method_A(int a, float b)
	{
		System.out.println("with int and float data type :"+a+","+b);
		return b;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m1=new MethodOverloading();
		m1.method_A();
		m1.method_A(false);
		m1.method_A(23.45);
		m1.method_A(25);
		m1.method_A(45, 67.34f);
		m1.method_A(78, 89);
	}

}






