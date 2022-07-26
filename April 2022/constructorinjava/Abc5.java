package constructorinjava;

//this can be passed as an argument in the method call.

public class Abc5 {

	int a,b;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc5 a1=new Abc5();
		a1.display();
		
	}
	
	//default constructor
	public Abc5()
	{
		a=5;
		b=10;
	}
	
	public void display()
	{
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		get(this);
	}
	
	public void get(Abc5 a2) 
	{
		a2.a=45;
		a2.b=78;
		System.out.println("a :"+a);
		System.out.println("b :"+b);		
	}
}