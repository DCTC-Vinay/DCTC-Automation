package throwKeywordInJava;

public class ThrowKeywordInJava {

	public static void main(String[] args) throws VoterEligibleException {
		// TODO Auto-generated method stub
		
		int age=17;
		if(age>=18)
		{
			System.out.println("You are eligible to Vote");
		}
		else
		{
			//ArithmeticException e=new ArithmeticException();
			throw new VoterEligibleException();
		}
	}

}


// User Defined Exception
class VoterEligibleException extends Exception
{
	public VoterEligibleException()
	{
		
	}
}
