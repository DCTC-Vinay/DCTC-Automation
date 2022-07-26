package decisionmaking;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x='r';
		
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
		{
			System.out.println("It is Vovel");
		}
		else
		{
			System.out.println("It is Consonent");
		}
		
		
		int a=20;

		if(a==20)		//true
		{
			System.out.println("Hello");
		}

		System.out.println("Hi");
		
		int n=46;
		
		if((n % 2)==0)
		{
			System.out.println("Number is Even");
		}
		
		System.out.println("Number is Odd");
	}

}
