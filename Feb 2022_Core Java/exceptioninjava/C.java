package exceptioninjava;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {10,0,20,30,40};
			int c=1;
			
			try
			{
				c=a[2]/a[1];
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println(c);
			
		}
}
