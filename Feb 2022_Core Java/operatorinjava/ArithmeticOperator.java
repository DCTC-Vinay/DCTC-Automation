package operatorinjava;

import java.util.Scanner;

public class ArithmeticOperator {

	int n;			//class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		substraction();
		multiplication();
		divide();
		modulus();
		
		int a;
		a=10;
		
		//ArithmeticOperator a1;			//reference
		//a1=new ArithmeticOperator();	//object

		ArithmeticOperator a1=new ArithmeticOperator();
		a1.average();
		a1.addition();
	}
	
	public void average()		//non static method
	{
		
	}
	public void addition()
	{
		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		
		int sum=a+b;
		System.out.println("Addition = "+sum);
	}
	public static void substraction()
	{
		int a=45,b=12,sub;
		sub=a-b;
		System.out.println("Substraction="+sub);
		
	}
	
	public static void multiplication()
	{
		int a=17,b=6,mul;
		mul=a*b;
		System.out.println("Multiplication="+mul);
	}
	
	public static void divide()
	{
		int a=10,b=2,div;
		div=a/b;
		System.out.println("Division="+div);
	}
	
	public static void modulus()
	{
		int a=5,b=2,mod;
		mod=a%b;
		System.out.println("Modulus="+mod);
	}
}
