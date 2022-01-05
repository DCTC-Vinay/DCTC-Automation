package takingInputfromUser;

import java.util.Scanner;

public class ScannerClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScannerClassInJava t=new ScannerClassInJava();		//User Defined Clas
		
		Scanner sc=new Scanner(System.in);		//Scanner class In Built Class
		int num = sc.nextInt();					//Taking Input as Integer
		
		t.searchNumber(num);
		
		System.out.println("Enter Number : ");
		num = sc.nextInt();					//Taking Input as Integer
		t.searchNumber(num);
		
	}
	
	public void searchNumber(int m)
	{
		int n[]= {34,32,21,67,87,95,56};
		int x=n.length;		//property of Array. Finding the length of Array.
		int i;

		for(i=0;i<x;i++)
		{
			if(n[i]==m)
			{
				System.out.println("Number Found at "+i+" location");
				break;
			}
		}
		
		if(i==x)
		{
			System.out.println("Number Not Found");
		}
	}

}
