package exceptioninjava;

import java.util.Scanner;

public class ThrowKeywordInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			try
			{
				throw new StringNotMatchException("Strings not matching");
			}
			catch(StringNotMatchException e)
			{
				e.printStackTrace();
			}
		}
	}

}
