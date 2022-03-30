package superkeyword;

public class B extends A{

	int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1=new B();
		
		B b2=new B(90);
		
		b1.show();
		
		b2.show();
		
	}
	
	public B()
	{
		//super(45,69);
		a=67;
		System.out.println("Child Class : a="+a);
	}
	
	public B(int a)
	{
		//super(22);
		this.a=a;
		System.out.println("Child Class Parameterised: a="+a);
	}
	
	public void show()
	{
		super.show();
		System.out.println("In Child Class");
	}

}
