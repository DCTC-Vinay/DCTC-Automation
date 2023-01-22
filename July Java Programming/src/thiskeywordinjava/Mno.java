
//Use of this keyword to access methods
package thiskeywordinjava;

public class Mno {

	int a;
	double b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mno m1=new Mno();
		m1.show();
		
		Mno m2=new Mno(7,2.14);
		m2.show();
	}
	
	//Default Constructor
	public Mno()
	{
		a=25;
		b=2;
	}
	
	//parameterised constructor
	public Mno(int a,double b)
	{
		//differentiating the class and local variable using this keyword
		this.a=a;	
		this.b=b;
		this.show();
	}
		
	public void show()
	{
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		this.multiply();
	}
	
	public void multiply()
	{
		System.out.println("Multiply : "+a*b);
	}
	
}


