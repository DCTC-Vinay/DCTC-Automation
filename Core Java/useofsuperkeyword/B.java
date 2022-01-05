package useofsuperkeyword;

public class B extends A {

	int c;
	
	public B()
	{
		super();
		a=45;
		b=65;
		
		System.out.println("In Default Constructor of B Class : "+a+" "+b);
	}
	
	public B(int a)
	{
		super(a);
		b=20;
		System.out.println("In Parameterised Constructor of B Class : "+a+" "+b);
	}
	
	public B(int a,int b, int c)
	{
		super(a,b);
		this.c=c;
		
	}
	
	public void addition()
	{
		int d=a+b+c;
		System.out.println("Addition is: "+d);
		
	}
	
	public void m2()
	{
		System.out.println("m2 method of B Class");
	}
	
	public void show()
	{
		
		System.out.println("Show method in B Class");
		super.show();
	}

	public static void main(String[] args) {
		
		B b3=new B(10,20,30);
		b3.show();
		b3.addition();
		b3.m4();
		
		B b1=new B();
		B b2=new B(23);
		
		
		
		b1.m2();
		b1.show();
		b1.m1();
	}
}
