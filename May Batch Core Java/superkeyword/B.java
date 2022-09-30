package superkeyword;

public class B extends A{

	int w;
	
	//Calling Default Constructor of Parent Class
	public B()
	{
		w=67;
	}
	public B(int z)
	{
		w=z;
	}
	
	public void show()
	{
		System.out.println("Value of w :"+w);
		System.out.println("Value of y :"+y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.show();
		
		B b2=new B(25);
		b2.show();
	}
	
	

}
