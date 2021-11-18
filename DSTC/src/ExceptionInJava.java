import java.io.File;
import java.io.FileInputStream;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Unchecked Exception
		int a=7;
		int b=2;
		int c=1;
		try			//outer try block
		{
			c=a/b;
			System.out.println("Value of C : "+c);
			
			a=15;
			b=0;
			try					//inner try block
			{
				c=a/b;
				int x[]=new int[5];
				x[2]=76;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				System.out.println("Inner Catch Block");
				e.printStackTrace();
			}
			finally
			{
				
			}
			String str="ss";
			Integer.parseInt(str);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Outer Catch Block");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
		c=a+b;
		System.out.println("Addition : "+c);
				
	}

}
