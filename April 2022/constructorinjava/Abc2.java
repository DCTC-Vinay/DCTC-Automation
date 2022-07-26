package constructorinjava;

//this can be used to refer current class instance variable

public class Abc2 {

	int a=10,b=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc2 a1=new Abc2();
		a1.display();
		a1.calculate();
		
		Abc2 a2=new Abc2(30,35);
		a2.display();
		a2.calculate();
		
		
	}
	
	//default constructor
	public Abc2()
	{
		a=20;
		b=25;
	}
	
	//parameterised constructor
	public Abc2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void display()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	
	public void calculate()
	{
		System.out.println(a*b);
	}

}
