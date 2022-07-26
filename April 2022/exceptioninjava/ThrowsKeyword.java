package exceptioninjava;

public class ThrowsKeyword {

	public static void main(String[] args) throws StringNotMatchingException, InterruptedException {
		
		// TODO Auto-generated method stub
		ThrowsKeyword t=new ThrowsKeyword();
		t.checkStrings();
}
	
public void checkStrings() throws StringNotMatchingException, InterruptedException
{
	String str1="Hello";
	String str2="Hi";
	
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	
	if(!str1.equals(str2))
	{
		throw new StringNotMatchingException("String Not Matched");
	}
	else
	{
		System.out.println("String Matching");
	}
}
}
