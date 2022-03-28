package thiskeywordinjava;

public class C {

	int id;
	String empName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C(123,"Ruturaj");		
		c1.display();
		
		
	}
	
	public C()
	{
		empName="Test";
		id=12122;
		D d1=new D(this);
		this.display();
	}
	
	public C(int id, String empName)
	{
		this();
		this.id=id;
		this.empName=empName;
		this.display();
	}

	public void display()
	{
		System.out.println("Emp Id: "+id);
		System.out.println("EmpName :"+empName);
		test(this);
	}
	
	public void test(C c3)
	{
		
	}
}




