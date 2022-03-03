package exceptioninjava;

import java.util.Scanner;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		System.out.println("Enter a :");
		a=sc.nextInt();
		
		System.out.println("Enter b :");
		b=sc.nextInt();
		
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Value of C :"+c);
		
		c=a+b;
		
		System.out.println("Addition :"+c);
	}

}
