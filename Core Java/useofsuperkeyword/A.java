package useofsuperkeyword;

public class A extends C {

	int a,b;
	
	public A()
	{
		a=45;
		b=65;
		
		System.out.println("In Default Constructor of A Class : "+a+" "+b);
	}
	
	public A(int a)
	{
		b=20;
		System.out.println("In Parameterised Constructor of A Class : "+a+" "+b);
	}
	
	public A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	//method is defined
	public void m1()
	{
		System.out.println("m1 method of A Class");
	}
	
	public void show()
	{
		System.out.println("Show method in A Class");
	}
	
}
