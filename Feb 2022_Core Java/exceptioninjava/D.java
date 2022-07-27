package exceptioninjava;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {10,0,20,30,40};
			int c=1;
			
			try
			{
				c=a[4]/a[2];
				System.out.println("Div:"+c);
				try
				{
					c=a[2]/a[0];
					System.out.println("Div:"+c);
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
				finally
				{
					System.out.println("In inner finally");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("In outer finally");
			}
			System.out.println(c);		
		}
}
