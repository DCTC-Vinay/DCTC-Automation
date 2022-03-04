package exceptioninjava;


//finally block
public class ExceptionInJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float c=0;
		int a[]= {2,3,0};
		
		try					//outer try block
		{
			
			try				//inner try block
			{
				c=a[0]/a[1];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("I am here inside inner try block");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am here");
		}
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}
