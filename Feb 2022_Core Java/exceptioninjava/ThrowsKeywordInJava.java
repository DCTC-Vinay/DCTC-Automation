package exceptioninjava;

import java.util.Scanner;

public class ThrowsKeywordInJava {

	public static void main(String[] args) throws StringNotMatchException {
		// TODO Auto-generated method stub
		
		ThrowsKeywordInJava tk=new ThrowsKeywordInJava();
		tk.stringComparison();
	}
	
	public void stringComparison() throws StringNotMatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String str=sc.next();
		
		System.out.println("Enter String 2 :");
		String str1=sc.next();

		if(str.equals(str1))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			throw new StringNotMatchException("Strings not matching");
		}
	}

}
