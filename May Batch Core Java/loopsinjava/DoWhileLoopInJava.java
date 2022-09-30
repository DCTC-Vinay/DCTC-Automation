package loopsinjava;

import java.util.Scanner;

public class DoWhileLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=0;
		
		do
		{
			System.out.println("Hello");
			z++;
		}while(z>5);
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=s.nextInt();
		
		int i=1;
		do
		{
			System.out.println(n*i);
			
			i++;
		}while(i<=10);
	}

}
