package exceptioninjava;

public class ThrowKeywordInJava2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int n=-1;
		
		if(n<0)
		{
			try
			{
				throw new NegativeNumberException();	//user defined exception
			}
			catch(NegativeNumberException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("Value of n:"+n);
	}

}

class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		System.out.println("Negative Number Exception");
	}
}






