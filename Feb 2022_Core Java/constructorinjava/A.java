package constructorinjava;

public class A {
	int emp_id=123344;
	String emp_name="Vijay";
	
	//default constructor
	  public A() 
	  { 
		  emp_id=123213; 
		  emp_name="Vinay"; 
	  }
	
	 //parameterised
	  public A(int e,String n)		 
	  {
		  emp_id=e;
		  emp_name=n;
	  }
	  public A(int e)
	  {
		  emp_id=e;
	  }
	
	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Employee Name :"+emp_name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();		//Calling of Default Constructor
		a1.show();

		A a2=new A();
		a2.emp_id=789123;
		a2.emp_name="Anil";
		a2.show();

		A a3=new A(123,"Ajay");
		a3.show();
		
		A a4=new A(3456);
		a4.show();
	}
}





