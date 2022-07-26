package exceptioninjava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=89;
		int m=0;
		int z=0;
		//unchecked exception
		try
		{
			z=n/m;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello Java");
		System.out.println("Programming");
		System.out.println("Value of z = "+z);
	}
}
