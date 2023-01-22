package exceptionhandling;

public class TestException4 {

	public static void main(String[] args) {
		
		int z=15,w=2;
		int m[]= {5,2,4,9};
		int n=0,x=0;
		
		try
		{
			n=z/w;
			try
			{
				x=m[0]/m[5];
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("inner finally block");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("outer finally block");
		}
		
		System.out.println("Value of n = "+n+" x="+x);
	}
}
