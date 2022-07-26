package polymorphism;

public class C extends B{

	
	public C()
	{
		System.out.println("Inside Child Class Constructor");
	}
	
	public void input()
	{
		System.out.println("In input method of C Class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.input();
		
		B b1=new C();
		b1.input();
		
		A a1=new C();
		a1.input();
	}
	
	

}
