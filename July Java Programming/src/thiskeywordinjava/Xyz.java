
//Use of this keyword to access class variables
package thiskeywordinjava;

public class Xyz {

	int a;
	double b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xyz a1=new Xyz();		//calling a default constructor
		a1.show();
		a1.multiply();
		
		Xyz a2=new Xyz(10,36.45);		//calling a parameterised constructor
		a2.show();
		a2.multiply();
		
		Xyz a3=new Xyz(72);
		a3.show();
		a3.multiply();
		
		Xyz a4=new Xyz(25,12.3);
		a4.show();
		a4.multiply();
	}
	
	//Default Constructor
	public Xyz()
	{
		a=45;
		b=75;
	}
	
	//parameterised constructor
	public Xyz(int a,double b)
	{
		//differentiating the class and local variable using this keyword
		this.a=a;	
		this.b=b;
	}
	
	public Xyz(int m)
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


