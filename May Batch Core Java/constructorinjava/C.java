package constructorinjava;

public class C {

	//static variables are shared among all objects
	static int m;
	
	//non static class variables has seperate copy for each object
	int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c3=new C(23);
		c3.show();
		
		C c4=new C(89.58);
		c4.show();
		
		C c5=new C(78,87);
		c5.show();
	
		c3.show();
		c4.show();
	}
	
	//parameterised constructor
	public C(int x)
	{
		m=x;
		n=89;
	}
	
	public C(int y, int x)
	{
		m=25;
		n=36;
		System.out.println("x= "+x+" y="+y);
	}
	
	public C(double s)
	{
		m=36;
		n=11;
		System.out.println("inside double constructor :"+s);
	}
	
	public void show()
	{
		System.out.println("Value of m :"+m);
		System.out.println("Value of n :"+n);
	}

}
