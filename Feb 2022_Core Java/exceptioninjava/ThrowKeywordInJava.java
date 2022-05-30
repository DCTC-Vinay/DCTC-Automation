package exceptioninjava;

import java.util.Scanner;

public class ThrowKeywordInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		
		if(n<0)
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
			System.out.println("Number is Positive");
		}
	}

}
