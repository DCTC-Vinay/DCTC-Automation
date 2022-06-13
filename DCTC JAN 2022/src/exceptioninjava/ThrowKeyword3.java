package exceptioninjava;

public class ThrowKeyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=-3;
		
		if(n<0)
		{
			try
			{
				throw new NegativeNumberException("Number is Negative");
			}
			catch(NegativeNumberException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Number is Positive");
		}
			
	}

}

class NegativeNumberException extends Exception
{
	NegativeNumberException(String str)
	{
		super(str);
	}
}










