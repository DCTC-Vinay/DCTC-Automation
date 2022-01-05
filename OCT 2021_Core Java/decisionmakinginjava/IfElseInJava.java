package decisionmakinginjava;

public class IfElseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//nested if block
		
		int i=16;
		int j=7;
		
		if(i<15)		//outer if block
		{
			if(j<5)		//inner if block
			{
				System.out.println("i is smaller than 15");
			}
			else
			{
				System.out.println("j is Greater than 5");
			}
		}
		else
		{
			System.out.println("i is greater than 15");
		}
		
		System.out.println("We are outside the if else block");
	}

}
