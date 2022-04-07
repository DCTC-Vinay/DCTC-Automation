package exceptioninjava;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		String str1="Hi";
		
		if(!str.equals(str1))
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("String Matched");
		}
			
	}

}
