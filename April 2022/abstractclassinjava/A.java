package abstractclassinjava;

public abstract class A {

	//when we have one or more abstract methods the class will be considered as abstract
	public abstract void show();
	
	public void display()
	{
		System.out.println("Inside method display");
	}
	
	public A()
	{
		System.out.println("Inside default constructor of Abstract Class A");
	}
	
}
