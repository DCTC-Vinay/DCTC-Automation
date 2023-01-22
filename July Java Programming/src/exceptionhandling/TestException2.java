package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {

	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException2 t1=new TestException2();
		t1.handleException(5, 0);
	}
	
	public void handleException(int m,int n)
	{
		int z[]= {5,2,5};
		try
		{
			//x=z[5]/z[0];
			x=m/n;
			int q=m/n;
			System.out.println("Value of q :"+q);
		}
		catch(Exception e)
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
