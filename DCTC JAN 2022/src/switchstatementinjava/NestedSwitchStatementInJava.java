package switchstatementinjava;

import java.util.Scanner;

public class NestedSwitchStatementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice: ");
		int ch=sc.nextInt();
		
		switch(ch)				//outer switch
		{
			case 1:
				System.out.println("Option 1");
				
				Scanner sc1=new Scanner(System.in);
				System.out.println("Nested Switch Enter Choice: ");
				int ch1=sc1.nextInt();
				
				switch(ch1)		//inner switch
				{
					case 1:
						System.out.println("Hello");
						break;
					case 2:
						System.out.println("Hi");
						break;
					case 3:
						System.out.println("Bye");
						break;
					default:
						System.out.println("Invalid Choice");
				}
				break;
			case 2:
				System.out.println("Option 2");
				break;
			case 3:
				System.out.println("Option 3");
				break;
			default:
				System.out.println("Default Choice");
				break;
			
		}
		
		System.out.println("Outside Switch");
		
	}

}
