package thiskeywordinjava;

public class B {
	
	int emp_id=123344;			//Class Variable
	String emp_name="Sarang";	//Class Variable
	
	//default constructor
	public B() 
	{ 
	  emp_id=123213; 
	  emp_name="Vinay";
	  this.show();			//this keyword for calling method
	}
	//parameterised
	public B(int emp_id,String emp_name)		  //local variable
	{
	  this.emp_id=emp_id;
	  this.emp_name=emp_name;
	  this.show();			//this keyword for calling method
	}
	
	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Employee Name :"+emp_name);
		this.test();		//use of this for calling method
	}
	
	public void test()
	{
		System.out.println("Test Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();		//Calling of Default Constructor
		//b1.show();

		B b2=new B(123,"Ganesh");
		//b2.show();
	}
}





