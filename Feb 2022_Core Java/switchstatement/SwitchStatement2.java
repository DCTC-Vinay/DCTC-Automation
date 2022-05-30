package switchstatement;

public class SwitchStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchStatement();
		switchStatementChar();
	}
	
	public static void switchStatement()
	{
		int ch=3;
		switch(ch)
		{
			case 1:
				addition(45, 5);
				break;
			case 2:
				substraction(34.12, 45.67);
				break;
			case 3:
				mul(12,2.5f);
				break;		
			default:
				System.out.println("Java");
		}
	}
	
	public static void switchStatementChar()
	{
		char ch='A';
		switch(ch)
		{
			case 'A':
			case 'a':
				addition(12, 32);
				break;
			case 's':
				substraction(34.12, 45.67);
				break;
			case 'm':
				mul(12,2.5f);
				break;		
			default:
				System.out.println("Java");
		}
	}
	
	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition :"+sum);
	}
	
	public static void substraction(double a,double b)
	{
		double sub=a-b;
		System.out.println("Substraction:"+sub);
	}
	
	public static void mul(int a,float b)
	{
		float mul = a*b;
		System.out.println("Multiplication :"+mul);
	}
	

}
