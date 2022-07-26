package abstractclassinjava;

public class B extends A{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1=new B();
		b1.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void display()
	{
		System.out.println("Inside display method of B class");
	}

}
