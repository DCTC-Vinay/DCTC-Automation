package operatorsinjava;

import java.util.Scanner;

public class OperatorsInJava {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic Operator
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value: ");
		boolean q = sc.nextBoolean();
		
		
		
		System.out.println("Enter Value for a: ");
		int a=sc.nextInt();
		
		
		
		System.out.println("Enter Value for b: ");
		int b=sc.nextInt();
		
		addition(a,b);
		
		System.out.println("Enter Value for a: ");
		a=sc.nextInt();
		
		System.out.println("Enter Value for b: ");
		b=sc.nextInt();
		
		substraction(a, b);
		
		
		multiplication(a, b);
		division(a, b);
		modulus(a, b);
		
	}
	
	public static void addition(int a,int b)
	{
		int c=a+b;	
		System.out.println("Addition = "+c);
	}
	
	public static void substraction(int a,int b)
	{
		int d=a-b;
		System.out.println("Substraction = "+d);
	}
	
	public static void multiplication(int a,int b)
	{
		int e=a*b;
		System.out.println("Multiplication = "+e);
		
	}
	
	public static void division(int a,int b)
	{
		int f=b/a;
		System.out.println("Division = "+f);
	}
	
	public static void modulus(int a,int b)
	{
		int g=a%b;
		System.out.println("Modulus = "+g);
	}

}
