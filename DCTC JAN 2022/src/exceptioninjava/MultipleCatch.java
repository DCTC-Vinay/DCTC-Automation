package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int divide=0;
		int a[]= {5,2,3,0};
		
		try
		{
			divide=a[0]/a[4];
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am Always Here");
		}
		
		System.out.println("Value of divide : "+divide);
		
		System.out.println("Hello ");
		System.out.println("Hi");
		
		
		
		
	}

}
