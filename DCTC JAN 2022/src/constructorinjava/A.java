package constructorinjava;

public class A {

	int e,f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		A a2=new A(50);
		
		System.out.println("Value of e for a2 :"+a2.e);
		System.out.println("Value of f for a2 :"+a2.f);
		
		a2.e=89;
		a2.f=90;
		
		System.out.println("Value of e for a2 :"+a2.e);
		System.out.println("Value of f for a2 :"+a2.f);
		
		System.out.println("Value of e for a1 :"+a1.e);
		System.out.println("Value of f for a1 :"+a1.f);
	}
	
	public A()
	{
		System.out.println("In Default Constructor");
		e=12;
		f=23;
	}
	
	public A(int n)
	{
		System.out.println("In Parameterised Constructor : "+n);
		e=24;
		f=34;
	}

}
