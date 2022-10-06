package exceptioninjava;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		
		int no[]= {56,0,25};
		
		x=no[1]*no[0];
		System.out.println("Multiplication :"+x);
		
		try
		{
			x=no[0]/no[1];
		}
		catch(Exception e)
		{
			System.out.println("Hello");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello I am in Finally");
		}
		
		System.out.println("Division :"+x);
		
		x=no[1]+no[0];
		System.out.println("Addition :"+x);
		
		x=no[1]-no[0];
		System.out.println("Substraction :"+x);
	}

}
