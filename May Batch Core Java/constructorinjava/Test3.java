package constructorinjava;

public class Test3 {

	int emp_id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3(36578);
	}

	public Test3()
	{
		//this(12345);		//Call to parameterised Constructor
		System.out.println("Default Constructor");
		emp_id=45890;
		System.out.println("Employee ID :"+emp_id);
	}
	
	public Test3(int z)
	{
		this();				//Call to Default Constructor
		System.out.println("Parameterised Constructor");
		emp_id=z;
		System.out.println("Employee ID :"+emp_id);
	}
}




