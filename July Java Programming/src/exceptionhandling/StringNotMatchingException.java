package exceptionhandling;

public class StringNotMatchingException extends Exception{
	
	public StringNotMatchingException(String str)
	{
		super(str);
	}
	
	public StringNotMatchingException()
	{
		
	}
}
