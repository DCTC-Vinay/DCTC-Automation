package loopsinjava;

import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=0;
		int arr[]= {2,3,4,5,6};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to search:");
		
		int n=sc.nextInt();
		
		for(int i=0;i<=4;i++)
		{
			if(arr[i]==n)
			{
				f=1;
				break;
			}
			
		}
		
		if(f==1)
		{
			System.out.println("Number Found");
		}
		
		else
		{
			System.out.println("Number Not Found");
		}
	}

}
