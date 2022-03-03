package exceptioninjava;

public class ExceptionInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float c=0;
		int a[]= {2,3,0};
		
		try
		{
			c=(float)a[0]/a[3];
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
