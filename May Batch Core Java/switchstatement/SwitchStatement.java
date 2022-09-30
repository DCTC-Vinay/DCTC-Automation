package switchstatement;

import java.util.Scanner;

import methodwithparameter.MethodWithParameter;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParameter m=new MethodWithParameter();
		
		Scanner s=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Enter 1. for Addition 2. add One Parameter ");
			System.out.print("Enter Your Choice : ");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				int a=89,b=90;
				int c=a+b;
				System.out.println("Addition is :"+c);
				break;
			case 2:
				System.out.println("In Case no 2");
				m.add_one_parameter(65);
				break;
			default:
				System.out.println("No Cases Matched");
			}
		}while(ch!=3);
	}
}