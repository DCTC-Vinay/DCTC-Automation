package abstractclassinjava;

public abstract class A {
	
	
	int emp_id=1312432;
	int n;
	int emp_sal=123445;
	
	public abstract void get_details();
	public abstract void get_salary();
	
	public A()
	{
		n=67;
		System.out.println("n = "+n);
	}
	
	public void show()
	{
		System.out.println("In show method of A Class");
	}
	
}
