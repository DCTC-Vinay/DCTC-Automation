package scannerinput;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in); //provided by java
		int n=0;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter 5 Numbers: ");
			n=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		System.out.println("Value is: "+n);
		
		/*System.out.println("Enter Value for n: ");
		int n=sc.nextInt(); //take an integer value
		
		System.out.println("Enter Value for m: ");
		int m=sc.nextInt();
		
		int add=m+n;
		System.out.println("Addition is: "+add);
		
		System.out.println("Enter Value for t: ");
		double t=sc.nextDouble();
		
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Value is: "+name);
		
		System.out.println("Enter True or  False : ");
		boolean x=sc.nextBoolean();
		System.out.println("Value is: "+x);
		
		System.out.println("Enter Float Value : ");
		float z=sc.nextFloat();
		System.out.println("Value is: "+z);*/

	}

}
