package switchstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCheckString();
	}
	
	static void switchCheck()
	{
		int marks=79;
		int m=marks/10;
		
		switch(m)
		{
			case 10:
			case 9:
			case 8:
				System.out.println("Distinction");
				break;
			case 7:
			case 6:
				System.out.println("First Class");
				break;
			case 5:
			case 4:
				System.out.println("Second Class");
				break;
			default:
				System.out.println("Fail");
		}
	}
	
	static void switchCheckChar()
	{
		char c='A';
		switch(c)
		{
			case 'a':
			case 'A':
				System.out.println("Case a");
				break;
			default:
				System.out.println("Default Case");
				break;

		}
		
	}
	
	static void switchCheckString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject:");
		String subject=sc.next();
		
		
		switch(subject)
		{
			case "English":
				System.out.println("Case English");
				break;
			case "Marathi":
				System.out.println("Case Marathi");
				break;
			case "Mathematics":
				System.out.println("Case Maths");
				break;
		}
		
	}


}







