package exceptioninjava;

public class ThrowKeywordInJava {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int n=-1;
		
		if(n<0)
		{
			try
			{
				throw new ArithmeticException();	//system defined exception
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("Value of n:"+n);
	}

}
