package constructorInJava;

public class Employee {

	int x,y;	//Class Variables
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.x=10;
		e.y=20;
		
		
		Employee e1=new Employee();
		e1.x=34;
		e1.y=4;
		
		System.out.println("Object 1");
		e.addition();
		System.out.println("Object 2");
		e1.addition();
		
		Employee e2=new Employee(23,3);
		System.out.println("Object 3");
		e2.addition();
		
		
	}
	
	public Employee()
	{
		System.out.println("In Default Constructor");
	}
	
	public Employee(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("In Parameterised Constructor: ");
	}
	
	public void addition()
	{
		int z=x+y;
		System.out.println("Addition is : "+z);
	}
	
	

}
