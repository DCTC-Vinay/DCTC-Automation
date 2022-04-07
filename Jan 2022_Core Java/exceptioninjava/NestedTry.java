package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int divide=0;
		int a[]= {5,2,3,0};
		
		try			//outer try
		{
			a[2]=5;
			try		//inner try
			{
				divide=a[0]/a[3];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner Catch Block");
				System.out.println(e);
			}
			finally
			{
				System.out.println("Inner Finally Block");
			}
		}
		catch(Exception e)
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
