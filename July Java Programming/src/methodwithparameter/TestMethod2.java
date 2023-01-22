package methodwithparameter;
public class TestMethod2 {
	static int x=90;
	int z=75;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(45,67);
		System.out.println("Value of x="+x);
		
		TestMethod2 tm=new TestMethod2();	//object
		tm.divide();
		System.out.println("Value of z="+tm.z);
	}

	//Static Methods
	public static void display()
	{
		
		System.out.println("Value of x:"+x);
		
		System.out.println("Employee Information");
		System.out.println("Name - Vinay");
		System.out.println("Company - ATOS");
	}
	public static void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum : "+c);
	}
	//Non Static Methods
	public void divide()
	{
		int x=98, y=3, z;
		z=x/y;
		System.out.println("Division :"+z);
		average(56,55,53);
	}
	public void average(int a, int b, int c)
	{
		z=(a+b+c)/3;
		System.out.println("Average : "+z);
	}
}