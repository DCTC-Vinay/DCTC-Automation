package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		int z=2;
		int q=1;
		
		try
		{
			q=x/z;
			System.out.println(q);
			
			int n[] = new int[5]; // One dimensional Array Declaration in Java

			// Array Initialization

			n[0] = 12;
			n[1] = 13;
			n[2] = 14;
			n[3] = 17;
			n[4] = 67;
			
			n[5]=14;
			
			System.out.println("Test Before Exception");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("In Arithmetic Exception");
			e.printStackTrace(); 
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In Array Index Exception");
			e.printStackTrace(); 
		}
		
		catch (Exception e) {
			System.out.println("In Exception");
			e.printStackTrace();
		}		
		
	
		System.out.println("Test After Exception");

		
	}

}
