package loopsinjava;

import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		
		boolean f=false;
		int i=0;
		
		int a[]= {4,2,6,7,8,9,12};
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value to Search : ");
		int n=sc.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				f=true;
				break;
			}
		}
		
		if(f==true)
		{
			System.out.print("Number Found at "+i+" location");
		}
		else
		{
			System.out.print("Number Not Found");
		}
		
	}
}
