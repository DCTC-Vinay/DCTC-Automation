package constructorinjava;

public class A {

	int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		System.out.println("a1 object");
		a1.show();
		a1.n=65;	
		
		A a2=new A();
		System.out.println("a1 object");
		a1.show();
		
		System.out.println("a2 object");
		a2.show();
	}
	
	//Default Constructor
	public A()
	{
		n=54;
	}
	
	
	public void show()
	{
		System.out.println("Value of n :"+n);
	}

}
