package polymorphism;

public class B extends A{

	public void input()
	{
		System.out.println("Input method of B Class");
	}
	
	public void display()
	{
		System.out.println("Display method of B Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1=new B();
		b1.input();
		
		A a1=new A();
		a1.input();
		
		A a2=new B();		//dynamic method dispatch
		a2.input();
		
		
	}
}
