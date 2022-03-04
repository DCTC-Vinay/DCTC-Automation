package exceptioninjava;


//nested try
public class ExceptionInJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float c=0;
		int a[]= {2,3,0};
		
		try					//outer try block
		{
			
			try				//inner try block
			{
				c=a[0]/a[3];
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}
