package exceptioninjava;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=-9;
		
		if(a < 0)
		{
			try
			{
				throw new NegativeNumberException("Number is Negative");
			}
			catch(NegativeNumberException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Number is positive");
		}
	}
}
