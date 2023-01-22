package operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st integer value : ");
		int a=s.nextInt();
		
		System.out.println("Enter 2nd integer value : ");
		int b=s.nextInt();
		
		//addition
		int c=a+b;
		System.out.println("Addition is :"+c);
		
		double x=54.23,y=12.43,z;
		
		//substraction
		z=x-y;
		System.out.println("Substraction is :"+z);
		
		z=y-x;
		System.out.println("Substraction is :"+z);
		
		//multiplication
		int n=5;
		a=9;
		c=a*n;
		System.out.println("Multiplication is :"+c);
		
		//division
		z=x/y;
		System.out.println("Division is in double :"+z);
		
		z=(double)a/b;
		System.out.println("Division is in double of two integers :"+z);
		
		float m;
		m=(float)(x/y);
		System.out.println("Division is in float :"+m);
		
		m=(float)a/b;
		System.out.println("Division is in float of two integers :"+m);
		
		
		//modulus --- it returns the remainder
		double f=45, g=12;
		int e;
		
		e=(int)(f % g);
		System.out.println("Modulus :"+e);
	}
}