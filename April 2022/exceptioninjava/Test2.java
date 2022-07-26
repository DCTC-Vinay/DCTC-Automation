package exceptioninjava;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {12,18,0,65};
		int z=0;
		
		//unchecked exception
		try
		{
			z=n[5]/n[1];
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello Java");
		System.out.println("Programming");
		System.out.println("Value of z = "+z);
	}
}
