package methodwithparameter;
public class TestMethod {
	static int x=90;
	int z=75;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=34, b=56, c=12;
		sum(45,67);
		display();
		sum(a,b);
		display();
		System.out.println("Value of x="+x);
		
		TestMethod tm1;		//reference
		
		TestMethod tm=new TestMethod();	//object
		tm.divide();
		tm.average(a, b, c);
		tm.average(35, 67, 54);
		System.out.println("Value of z="+tm.z);
	}

	//Static Methods
	public static void display()
	{
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
	}
	public void average(int a, int b, int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("Average : "+avg);
	}
}