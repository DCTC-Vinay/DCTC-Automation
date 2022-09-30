package loopsinjava;

import java.util.Scanner;

public class WhileLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=s.nextInt();
		
		int i=1;
		while(i<=10)
		{
			System.out.println(n*i);
			
			i++;
		}
	}

}
