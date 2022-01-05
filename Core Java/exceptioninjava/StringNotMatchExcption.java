package exceptioninjava;

public class StringNotMatchExcption extends Exception{

	public StringNotMatchExcption()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		match("Hello");
		
	}
	
	public static void match(String str)
	{
		if(str.equals("hi"))
		{
			System.out.println("String Matched");
		}
		else
		{
			try
			{
				throw new StringNotMatchExcption();
			}
			catch(StringNotMatchExcption e)
			{
				e.printStackTrace();
			}
			System.out.println("Test Input");
		}
	}
}
