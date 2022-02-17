package test;

public class FirstProgram {

	int n=10;		//Class variable or Instance Variable
	static int emp_id=45;	//Static Variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello to DCTC December 2021");
		System.out.println("Hello Java");
		System.out.println("Vinay");
		
		int count=100;			//Local Variable
		
		char c='a';
		
		System.out.println(c);
		
		test();
		
		FirstProgram fp1;			//reference
		fp1=new FirstProgram();		//object
		
		FirstProgram fp=new FirstProgram();		//created object
		fp.test2();
	}
	
	public static void test()			// Static Method
	{
		System.out.println("Test Method");
		System.out.println(emp_id);
	}
	
	public void test2()				// Non Static Method
	{
		System.out.println("Test2 Method");
		System.out.println(emp_id);
	}
	
}