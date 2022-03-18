package decisionmakingstatement;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Percentage : ");
		
		int percentage=s.nextInt();

		if(percentage >= 75)
		{
			System.out.println("distinction");
		}
		else if(percentage >=60)
		{
			System.out.println("first class");
		}
		else if(percentage >=40)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("fail");	
		}
		
		System.out.println("End of 1st Program");
		
		
		
	}

}
