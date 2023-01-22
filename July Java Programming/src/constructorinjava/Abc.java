package constructorinjava;

public class Abc {

	int a;
	double b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc a1=new Abc();		//calling a default constructor
		a1.show();
		a1.multiply();
		
		Abc a2=new Abc(10,36.45);		//calling a parameterised constructor
		a2.show();
		a2.multiply();
		
		Abc a3=new Abc(72);
		a3.show();
		a3.multiply();
	}
	
	//Default Constructor
	public Abc()
	{
		a=45;
		b=75;
	}
	
	//parameterised constructor
	public Abc(int x,double y)
	{
		a=x;
		b=y;
	}
	
	public Abc(int m)
	{
		a=m;
		b=2;
	}
	
	public void show()
	{
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
	}
	
	public void multiply()
	{
		System.out.println("Multiply : "+a*b);
	}
	
}


