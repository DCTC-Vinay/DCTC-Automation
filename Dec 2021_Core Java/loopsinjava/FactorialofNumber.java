package loopsinjava;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
				a=a*i;
		}
		
		System.out.println("Factorial of Number : "+a);
		
		int b=1;
		for(int i=n;i>=1;i--)
		{
				b=b*i;
		}
		System.out.println("Factorial of Number : "+b);
	}

}
