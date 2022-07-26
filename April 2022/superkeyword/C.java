package superkeyword;

public class C extends B{

	int x, y;
	public C()
	{	
		super(15);
		x=30;
		y=70;
		System.out.println("Inside C Class Default Constructor : "+x+" "+y);
		System.out.println("Values of a and b : "+a+" "+b);
		System.out.println("Values of m and n : "+m+" "+n);
	}
	
	public C(int a)
	{
		super();
		System.out.println("Inside Child C Class Parameterised");
	}
	
	public void input()
	{
		super.input();
		System.out.println("In Input method of C Class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.input();
		
		C c2=new C(87);
		c2.input();

	}
	
	

}
