package inheritenceinjava;

public class C extends B{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		
		c1.show_methodofa();
		c1.display();
		c1.show_methodofc();
	
	}
	
	public void show_methodofc()
	{
		System.out.println("Inside show method of C Class");
	}

}