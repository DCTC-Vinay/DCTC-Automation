package exceptioninjava;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {10,0,20,30,40};
			int c=1;
			
			try
			{
				c=a[5]/a[1];
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(c);
			
		}
}
