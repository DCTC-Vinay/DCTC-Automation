package operator;

public class TernaryOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ?: Ternary Operator

		int a=12,b=22;
		char x;
		//int n=75, m=100;
		
		x=(a>b)?'e':'f';
		
		System.out.println("Value of x : "+(a>b)+" "+x);
		
		
		//Decision making / Control Statement
		
		if(a<=b)			//true
		{
			System.out.println("Value of a is greater than b");
		}
		else			//false
		{
			System.out.println("Value of b is greater than a");
		}
	}

}
