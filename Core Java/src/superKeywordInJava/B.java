package superKeywordInJava;

public class B extends A{

	int m=10;
	int n=20;
	public B()
	{
		
		this(10);
		System.out.println("Default Constructor of B");
		
	}
	
	public B(int a)
	{
		super(45);
		System.out.println("Parameterised Constructor of B");
	}
	
	public int m3()
	{
		System.out.println("m1 method of B");
		return 0;
	}
	
	public void m2()
	{
		super.m2();
		System.out.println("m2 method of B");
	
	}
	
	public void addition()
	{
		int c=super.m+this.n;
		System.out.println("Addition is :"+c);
	}
	public static void main(String []args)
	{
		B b1=new B();
		b1.addition();
		
	}
}
