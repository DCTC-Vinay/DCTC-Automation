package arrayinjava;

import java.util.Scanner;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int m[]= new int[5];
		
		for(int j=0;j<m.length;j++)
		{
			System.out.println("Enter Value : ");
			m[j]=sc.nextInt();
		}
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Value at "+i+" : "+m[i]);
		}
		
		int flag=0;
		System.out.println("Enter number to search : ");
		int num=sc.nextInt();
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==num)
			{
				
				System.out.println("The number is found at "+i+" location");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("The number not found");
		}
				
	}

}
