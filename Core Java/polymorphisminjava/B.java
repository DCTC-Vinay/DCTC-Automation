package polymorphisminjava;

public class B extends A{
	
	public void input()
	{
		System.out.println("In Input Method of B Class");
	}
	
	public void show()
	{
		System.out.println("In Show Method of B Class");
	}
	
	public static void main(String[] args) {
		
		B b1=new B();
		b1.input();
		b1.show();
		
		A a1=new A();
		a1.show();
		
		//Dynamic Method Dispatch
		A a3=new B();
		a3.show();
		
		A a4=new C();
		a4.show();
	}
}
