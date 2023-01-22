package takinginput;

import java.util.Scanner;

public class TakingInputInJava {
	
	public int f=45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TakingInputInJava t=new TakingInputInJava();
		
		Scanner s=new Scanner(System.in);		//constructor

		//For taking Integer type of value using Scanner Class
		
		System.out.println("Enter integer Value for x & y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		
		
		System.out.println("Sum = "+t.take_input(x, y));
		
		
		
		//For taking double type of value using Scanner Class
		System.out.println("Enter double value for n : ");
		double n=s.nextDouble();
		
		System.out.println("Square of Number : "+t.take_input_double(n));
		
		//For taking String type of value using Scanner Class
		System.out.println("Enter 1st String: ");
		String s1=s.next();
		
		System.out.println("Enter 2nd String: ");
		String s2=s.next();
		
		System.out.println("Concatenate : "+t.concatenate(s1, s2));
	}
	
	public int take_input(int a, int b)
	{
		return (a+b);
	}
	
	public double take_input_double(double n)
	{
		return (n*n); 
	}
	
	public String concatenate(String x, String y)
	{
		return x+y;
	}
	
	
}




