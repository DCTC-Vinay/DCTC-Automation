package superkeywordinjava;

public class B extends A {
	
	public B()
	{
		System.out.println("Inside B Class Constructor");
	}
	
	public B(int a,int b)
	{
		super(a);
		System.out.println("Value of b :"+b);
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Inside show method of B Class");
		
	}
}
