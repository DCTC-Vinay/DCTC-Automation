package superkeyword;

public class A{
	
	int m, n;
	
	public A() {
		System.out.println("Inside Parent Class A Default Constructor");
	}
	
	public A(int e) {
		System.out.println("Inside Parent Class A Parameterised Constructor");
		m=32;
		n=12;
	}
	 
	public void input()
	{
		System.out.println("Input method of A Class");
	}
	
	public void display()
	{
		System.out.println("Display method of A Class");
	}
	

}
