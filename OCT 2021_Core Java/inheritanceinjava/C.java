package inheritanceinjava;

public class C extends A {

	public void display()
	{
		System.out.println("Display Method In C Class");
	}
	
	public static void main(String[] args) {
		C c1=new C();
		c1.display();
		c1.show();
		
		
	}
}
