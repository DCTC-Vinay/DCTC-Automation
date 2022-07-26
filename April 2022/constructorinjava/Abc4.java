package constructorinjava;

//this() can be used to invoke current class constructor.

public class Abc4 {

	int a=10,b=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc4 a1=new Abc4();
	}
	
	//default constructor
	public Abc4()
	{
		this(12,58);		//call to the parameterised constructor
		a=5;
		b=10;
		this.display();
	}
	
	//parameterised constructor
	public Abc4(int a, int b)
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
