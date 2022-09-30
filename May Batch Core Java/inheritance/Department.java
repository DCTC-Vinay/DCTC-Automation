package inheritance;

public class Department {

	int dept_id=1502;
	String dept_loc="Pune";
	
	public Department()
	{
		System.out.println("Inside Department Constructor");
	}
	public void dept_info()
	{
		System.out.println("Inside Parent Class Department");
	}
	
	public void get()
	{
		System.out.println("Inside Parent Class Department");
	}
	
	public void get(int n)
	{
		System.out.println("Inside Parent Value of n:"+n);
	}
}
