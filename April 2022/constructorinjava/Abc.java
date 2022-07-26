package constructorinjava;

public class Abc {

	int a=10,b=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc a1=new Abc();
		a1.display();
		a1.calculate();
		
		Abc a2=new Abc(30,35);
		a2.display();
		a2.calculate();
		
	}
	
	//default constructor
	public Abc()
	{
		a=20;
		b=25;
	}
	
	//parameterised constructor
	public Abc(int x, int y)
	{
		a=x;
		b=y;
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
