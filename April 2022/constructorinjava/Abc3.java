package constructorinjava;

//this can be used to invoke current class method (implicit)

public class Abc3 {

	int a=10,b=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc3 a1=new Abc3();
	
		Abc3 a2=new Abc3(2,3);
	}
	
	//default constructor
	public Abc3()
	{
		a=5;
		b=10;
		
		this.display();
	}
	
	//parameterised constructor
	public Abc3(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		this.display();
	}
	
	public void display()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	
		calculate(); //called a method inside method
	}
	
	public void calculate()
	{
		System.out.println(a*b);
	}

}
