package exceptioninjava;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		
		int no[]= {56,0,25};
		
		x=no[1]*no[0];
		System.out.println("Multiplication :"+x);
		
		try
		{
			x=no[0]/no[2];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Division :"+x);
		
		x=no[1]+no[0];
		System.out.println("Addition :"+x);
		
		x=no[1]-no[0];
		System.out.println("Substraction :"+x);
	}

}
