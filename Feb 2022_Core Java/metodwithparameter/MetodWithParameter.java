package metodwithparameter;

import java.util.Scanner;

public class MetodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum=addition(10,20);
		System.out.println(sum);
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Double Value for a :");
		double a=s1.nextDouble();
		
		System.out.println("Enter Double Value for b :");
		double b=s1.nextDouble();
		
		substraction(a, b);
		
		System.out.println("Enter int value for a :");
		int d=s1.nextInt();
		
		System.out.println("Enter float value for b :");
		float e=s1.nextFloat();
		
		mul(d,e);
		
	}
	
	public static int addition(int a, int b)
	{
		//int sum=a+b;
		//System.out.println("Addition :"+sum);
		return a+b;
	}
	
	public static void substraction(double a,double b)
	{
		double sub=a-b;
		System.out.println("Substraction:"+sub);
	}
	
	public static void mul(int a,float b)
	{
		float mul = a*b;
		System.out.println("Multiplication :"+mul);
	}

}
