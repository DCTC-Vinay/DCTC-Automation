package interfacedemo;

public class Z implements A,C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new Z();
		a1.show();
		
		C c1=new Z();
		c1.show();
	}
	
	public void show()
	{
		System.out.println("Inside Show method");
	}

}
