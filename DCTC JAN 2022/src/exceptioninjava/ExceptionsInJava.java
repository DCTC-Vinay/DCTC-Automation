package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checked exceptions
		
		//File f=new File("");
		//FileInputStream fin=new FileInputStream(f);
		
		
		int m=0;
		int divide=0;
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		n=sc.nextInt();
		System.out.println("value of n: "+n);
		
		try
		{
			divide=n/m;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("Value of divide : "+divide);
		
		System.out.println("Hello ");
		System.out.println("Hi");
		
		
	}

}
