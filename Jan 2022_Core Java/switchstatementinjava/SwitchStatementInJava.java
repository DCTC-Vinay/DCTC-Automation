package switchstatementinjava;

import java.util.Scanner;

public class SwitchStatementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice: ");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'A':
				System.out.println("Option a");
				break;
			case 1:
				System.out.println("Option 1");
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
