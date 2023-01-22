package inheritanceinjava.singleinheritance;

//single inheritance -- there is one parent and one child class

public class Xyz extends Abc{
	
	int x=23,y=57;
	public Xyz()
	{
		x=30;
		y=40;
		System.out.println("inside default constructor of Xyz");
	}
	public void test_xyz()
	{
		System.out.println("Inside Xyz Class");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
	public static void main(String[] args) {
		
		Xyz x=new Xyz();
		x.test_xyz();
		x.test_abc();
	}

}
