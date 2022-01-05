package exceptioninjava;

public class ThrowKeywordInJava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		negativeNumber(-3);
		
	}
	
	public static void negativeNumber(int n)
	{
		if(n<0)
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			System.out.println("Test Input");
		}
		else
		{
			System.out.println(n);
		}
	}
}
