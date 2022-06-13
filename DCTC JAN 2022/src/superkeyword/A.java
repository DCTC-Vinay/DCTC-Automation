package superkeyword;

public class A {

	int a,b;
	
	public A(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent Class Parameterised: a="+a+" b="+b);
	}
	
	public A()
	{
		System.out.println("Parent Class Default A class:");
	}
	public A(int a)
	{
		this.a=a;
		System.out.println("Parent Class Parameterised: a="+a);
	}
	
	public void show()
	{
		System.out.println("In Parent Class");
	}
}
