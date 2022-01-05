package thiskeywordinjava;

public class B {
	
	
	public static void main(String []args)
	{
		B b1=new B();
	}
	
	
	B()
	{
		System.out.println("In B Class Constructor");
		A a1=new A(this);
	}

}
