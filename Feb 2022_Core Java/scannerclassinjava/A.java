package scannerclassinjava;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value : ");
		
		int n=s1.nextInt();
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(n*j);
		}
	
		
		//Taking Input For Addition
		
		System.out.println("Enter Value For a : ");
		int a=s1.nextInt();
		
		System.out.println("Enter Value For b : ");
		int b=s1.nextInt();
		
		int sum=a+b;
		
		System.out.println("Addition :"+sum);
		
	}

}
