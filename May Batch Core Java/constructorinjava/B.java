package constructorinjava;

public class B {

	int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b3=new B(23);
		System.out.println("b3 object");
		b3.show();
		
		B b4=new B(89.58);
		
		B b5=new B(78,87);
	}
	
	//parameterised constructor
	public B(int x)
	{
		n=x;
	}
	
	public B(int y, int x)
	{
		System.out.println("x= "+x+" y="+y);
	}
	
	public B(double s)
	{
		System.out.println("inside double constructor :"+s);
	}
	
	public void show()
	{
		System.out.println("Value of n :"+n);
	}

}
