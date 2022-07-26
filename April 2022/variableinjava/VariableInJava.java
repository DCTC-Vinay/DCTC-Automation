package variableinjava;

public class VariableInJava {
	
	int emp_salary;			//class variable or instance variable
	static String emp_address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local variables -- variables declared and initialized in function/method called as local variable
		int emp_id=505;
		String emp_city="Pune";
		
		int a=23;
		int b=56;
		double q=245.78;
		boolean x=true;
		
		System.out.println("Employee ID : "+emp_id);
		System.out.println("Employee City : "+emp_city);
		System.out.println(q);
		System.out.println(a);
		
		System.out.println("b="+b+" a="+a);
		
		System.out.println("Employee ID : "+emp_id+" Employee City : "+emp_city);
		
		VariableInJava v=new VariableInJava();	//creating an object
		v.emp_salary=78000;
		v.display();
		
		//emp_salary=78000;
		
		emp_address="Mumbai";
		show();
	}
	
	//static function or method
	public static void show()
	{
		System.out.println("In Show Method");
	}
	
	//non static function or method
	public void display()
	{
		System.out.println("In Display Method");
	}
}




