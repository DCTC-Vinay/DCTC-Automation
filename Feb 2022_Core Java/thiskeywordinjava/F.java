
//use of this as Parameter to Constructor
package thiskeywordinjava;

public class F {
	
	int emp_id;			//Class Variable
	String emp_name;	//Class Variable
	
	public F()
	{
		emp_id=789; 
		emp_name="ABC";
		E e1=new E(this);
	}	
}





