package decisionmakinginjava;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float percentage=74.9f;
		
		if(percentage>=75)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First Class");
		}
		else if(percentage>=40)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
