package superKeywordInJava;

public class A {

	int m=76;
	int n=67;
	
	public A()
	{
		System.out.println("Default Constructor of A");
	}
	
	public A(int a)
	{
		System.out.println("Parameterised Constructor of A");
	}
	
	public int m1(int n)
	{
		System.out.println("m1 method of A: "+n);
		return 0;
	}
	
	public void m2()
	{
		System.out.println("m2 method of A");
	}
}
