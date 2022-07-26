package inheritanceinjava;

public class B extends A{

	int x=25,y=100;
	
	public void get()
	{
		System.out.println("In Get Method from B Class");
	}
	
	public static void main(String[] args) {
		
		B b1=new B();
		b1.display();
		b1.get();
	}
}
