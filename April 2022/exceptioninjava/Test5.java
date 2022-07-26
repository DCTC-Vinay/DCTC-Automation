package exceptioninjava;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {12,18,0,65};
		int z=0;
		
		//Nested try block
		//outer try block
		try
		{
			z=n[1]/n[0];
			//inner try block
			try
			{
				z=n[0]/n[5];
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am always here");
		}
		
		System.out.println("Hello Java");
		System.out.println("Programming");
		System.out.println("Value of z = "+z);
	}
}
