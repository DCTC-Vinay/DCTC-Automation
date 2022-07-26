package superkeyword;

public class B extends A {
	
	int a, b;
	
	public B() {
		System.out.println("Inside B Class Default Constructor");
	}
	
	public B(int e) {
		System.out.println("Inside B Class Parameterised Constructor");
		a=32;
		b=12;
	}
	 
	public void input()
	{
		System.out.println("Input method of B Class");
	}
	
	public void display()
	{
		System.out.println("Display method of B Class");
	}
	

}
