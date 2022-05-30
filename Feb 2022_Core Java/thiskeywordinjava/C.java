//use of this for calling class variable,methods and constructor
package thiskeywordinjava;

public class C {
	int emp_id;			//Class Variable
	String emp_name;	//Class Variable
	
	//default constructor
	public C() 
	{
	  emp_id=789; 
	  emp_name="ABC";
	  this.show();
	}
	//parameterised
	public C(int emp_id,String emp_name)		  //local variable
	{
	  this();
	  this.emp_id=emp_id;
	  this.emp_name=emp_name;
	}
	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Employee Name :"+emp_name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		C c1=new C(456,"XYZ");			// call the default constructor
		c1.show();
	}
}





