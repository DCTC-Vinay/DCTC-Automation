package exceptioninjava;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=34,b=0,c=0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("division :"+c);
		c=a+b;
		System.out.println("sum :"+c);
		
		int x[]= {12,34,45};
		try
		{
			System.out.println(x[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("After Array Exception");
	}
}
