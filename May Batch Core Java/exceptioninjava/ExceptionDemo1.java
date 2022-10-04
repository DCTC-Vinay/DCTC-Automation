package exceptioninjava;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=56, n=0, x=0;
		
		x=no*n;
		System.out.println("Multiplication :"+x);
		
		try
		{
			x=no/n;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Division :"+x);
		
		x=no+n;
		System.out.println("Addition :"+x);
		
		x=no-n;
		System.out.println("Substraction :"+x);
	}

}
