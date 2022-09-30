package methods;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnType m=new MethodWithReturnType();
		m.test_add();
		
		System.out.println("Inside Main Method");
		char q=(char) m.test_square(9);
		System.out.println(q);
		
		boolean z=m.test_compare(45.58, 85.68);
		System.out.println("Result is : "+z);
	}

	public int test_square(int a)
	{
		return a*a;
	}
	
	public void test_add()
	{
		System.out.println("inside test_add method");
		int q=test_square(25);
		System.out.println(q);
	}
	
	public boolean test_compare(double n, double m)
	{
		boolean x;
		if(n==m)
		{
			x=true;
		}
		else
		{
			x=false;
		}
		return x;
	}
	
		
}





