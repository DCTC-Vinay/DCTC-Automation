package typesofvariable;

public class TypesOfVariable {

	//class variable -- declared inside a class
		String emp_dept="IT"; //non static
		
	//static variable
		static String emp_city="Pune";
		static int e=0;
		static double f=56;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local variable -- which are declared inside function
		//and the scope is upto the closing of function

		int emp_id = 0;
		double emp_salary=55250;
		 
		System.out.println(emp_id);
		
		//System.out.println(emp_dept);
		
		System.out.println(emp_city);
	}
	
	
}
