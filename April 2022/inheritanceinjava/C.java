package inheritanceinjava;

public class C extends B{

	
	public void show()
	{
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		System.out.println("Value of x :"+x);
		System.out.println("Value of y :"+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.display();
		c1.get();
		c1.show();
	}

}
