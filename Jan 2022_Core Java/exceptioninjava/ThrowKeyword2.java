package exceptioninjava;

public class ThrowKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		String str1="Hi";
		
		
		if(!str.equals(str1))
		{
			try
			{
				throw new StringNotMatchedException("String Not Matched");
			}
			catch(StringNotMatchedException e)
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

class StringNotMatchedException extends Exception
{
	StringNotMatchedException(String str)
	{
		super(str);
	}
}










