package finallyKeywordInJava;

public class FinallyKeywordInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=0;
		int c=1;
		try			
		{
			c=a/b;
			System.out.println("Value of C : "+c);
		
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am in Finally");
		}
		c=a+b;
		System.out.println("Addition : "+c);
	}

}
