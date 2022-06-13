package thiskeywordinjava;

public class B {

	int id;
	String empName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		B b2=new B(123,"Vinay");
		
		//b1.display();
		//b2.display();
		
	}
	
	public B()
	{
		empName="Test";
		id=12122;
		this.display();
	}
	
	public B(int id, String empName)
	{
		this.id=id;
		this.empName=empName;
		this.display();
	}

	public void display()
	{
		System.out.println("Emp Id: "+id);
		System.out.println("EmpName :"+empName);
	}
}
