
//use of this as Parameter to method
package thiskeywordinjava;

public class D {
	
	int emp_id;			//Class Variable
	String emp_name;	//Class Variable

	//default constructor
	public D() 
	{
	  emp_id=789; 
	  emp_name="ABC";
	  this.test(this);	//it will pass this as argument in test method
	}
	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Employee Name :"+emp_name);
	}
	public void test(D d2)		//using object for calling variable and method
	{
		System.out.println("Test Method");
		System.out.println(d2.emp_id);
		System.out.println(d2.emp_name);
		d2.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();			// call the default constructor
	}
}





