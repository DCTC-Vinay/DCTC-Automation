package takinginput;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TakeInput t=new TakeInput(); //user defined class
		Scanner s=new Scanner(System.in); //java defined class
		
		System.out.println("Enter Value for a: ");
		int a=s.nextInt();
		
		System.out.println("Enter Value for b : ");
		int b=s.nextInt();
		
		t.sum(a, b);
		
	}
	
	public void sum(int a, int b)
	{
		int c= a + b;
		System.out.println("Sum :"+c);
	}

}
