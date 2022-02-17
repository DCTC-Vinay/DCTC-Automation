package methodwithparameter;

public class MethodWithParameterAndReturnType {

	int c=13;
	static int d=34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double t=displayDouble(23.35,22.12);
		System.out.println("Value of t="+t);
		
		MethodWithParameterAndReturnType m=new MethodWithParameterAndReturnType();
				
		boolean e=m.checkAge(21);
		System.out.println("After execution of checkAge = "+e);
		
		
		
		
	}
	public static double displayDouble(double n,double m)
	{
		System.out.println("Value of d :"+d);
		return n+m;
	}
	
	public void displayCharacter(char x)
	{
		System.out.println("Value of C :"+c);
		System.out.println(x);
	}
	
	public void displayName(String lname)
	{
		System.out.println("Value of C :"+c);
		System.out.println("Vinay "+lname);
	}
	
	public boolean checkAge(int age)		//parameterised non static method
	{
		System.out.println("Value of C :"+c);
		boolean t;
		if(age>=18)
		{
			System.out.println("You are eligible for Voting");
			t=true;
		}
		else
		{
			System.out.println("You are not eligible for Voting");
			t=false;
		}
		
		displayCharacter('W');
		displayName("Salunke");
		average(12, 13, 14);
		
		displayDouble(12,13);
		
		return t;
	}
	
	public void average(int a,int b, int c)
	{
		System.out.println("Value of C :"+c);
		int avg=(a+b+c)/3;
		System.out.println("Average = "+avg);
	}
	

}
