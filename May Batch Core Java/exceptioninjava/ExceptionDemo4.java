package exceptioninjava;

//throw keyword
public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=-5;
		if(n<0)
		{
			try
			{
				throw new NegativeNumberException("Its Negative Number");
			}
			catch(NegativeNumberException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Greater than 0");
		}
		
	}

}
