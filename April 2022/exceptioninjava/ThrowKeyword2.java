package exceptioninjava;

public class ThrowKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Hello";
		String str2="Hi";
		
		if(!str1.equals(str2))
		{
			try
			{
				throw new StringNotMatchingException("String Not Matched");
			}
			catch(StringNotMatchingException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("String Matching");
		}
	}
}
