package methodwithparameter;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParameter m=new MethodWithParameter();
		m.displayCharacter('W');
		m.displayName("Salunke");
		m.average(12, 13, 14);
		m.checkAge(15);
		
		displayDouble(334.34);
	}
	public static void displayDouble(double n)
	{
		System.out.println(n);
	}
	
	public void displayCharacter(char x)
	{
		System.out.println(x);
	}
	
	public void displayName(String lname)
	{
		System.out.println("Vinay "+lname);
	}
	
	public void checkAge(int age)		//parameterised non static method
	{
		if(age>=18)
		{
			System.out.println("You are eligible for Voting");
		}
		else
		{
			System.out.println("You are not eligible for Voting");
		}
	}
	
	public void average(int a,int b, int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("Average = "+avg);
	}
	

}
