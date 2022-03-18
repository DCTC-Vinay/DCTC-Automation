package decisionmakingstatement;

import java.util.Scanner;

public class NestedIfInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int n=s.nextInt();

		if(n >= 10)			//outer
		{
			if(n>5)			//inner
			{
				System.out.println("Value of n="+n);
			}
		}
		
		
	}

}
