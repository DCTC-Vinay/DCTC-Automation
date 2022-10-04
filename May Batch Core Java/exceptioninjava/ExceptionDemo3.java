package exceptioninjava;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		
		int no[]= {56,0,25};
		
		x=no[1]*no[0];
		System.out.println("Multiplication :"+x);
		
		try
		{
			x=no[3]/no[1];
		}
		catch(Exception e)
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
