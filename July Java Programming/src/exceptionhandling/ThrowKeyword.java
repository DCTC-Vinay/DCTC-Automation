package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowKeyword t1=new ThrowKeyword();
		t1.compare_numbers(12, 25);
	}
	
	public void compare_numbers(int m, int n)
	{
		if(n<m)
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("n is greater than m");
		}
	}

}
