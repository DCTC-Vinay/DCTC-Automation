package finalkeywordinjava;

public class B extends A{

	
	//overriding method
	public void get_empid()
	{
		System.out.println("Inside Child Class");
	}
	
	/*public void get_empsalary()
	{
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1=new B();
		b1.get_empid();
	}

}
