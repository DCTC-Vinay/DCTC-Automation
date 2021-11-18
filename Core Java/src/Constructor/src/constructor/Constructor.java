package constructor;

public class Constructor {

	int rollno; //instance variable
	String name;
	String dept;
	
	
	public Constructor()
	{
		rollno=10;
		name="Vinay";
		dept="CSE";
		
		A a1=new A(this);
		
	}
	
	public void info()
	{
		
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Department : "+dept);
		method2();
	}
	
	public void method2()
	{
		System.out.println("Inside Method 2 of Constructor Class");
		method3(this);
	}
	
	public void method3(Constructor c)
	{
		System.out.println("Inside Method 3 of Constructor Class");
	}
	
	
	
	
	/*public Constructor() //default constructor
	{
		rollno=10;
		name="Anand";
		dept="EE";
		this.info();
	}
	public Constructor(int rollno,String name)  //parameterized constructor
	{
		this();
		this.rollno=rollno;
		this.name=name;
		this.dept="ME";
		this.info();
	}
	
	public Constructor(int rollno,String name,String dept)
	{
		this(rollno,name);
		this.dept=dept;
	}*/
	
	
	
	
}


