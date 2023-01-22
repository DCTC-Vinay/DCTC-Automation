package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException t1=new TestException();
		t1.handleException(5, 0);
	}
	
	public void handleException(int m,int n)
	{
		int z[]= {5,2,5};
		try
		{
			x=z[1]/z[0];
			//x=m/n;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am here");
		}
		System.out.println("Division is : "+x);
	}
}
