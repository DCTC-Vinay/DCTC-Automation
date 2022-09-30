package methodwithparameter;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParameter m=new MethodWithParameter();
		m.add_one_parameter(58);
		m.sub_two_parameter(75, 50);
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Three Values");
		
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		float c=s1.nextFloat();
		
		m.avg_three_parameter(a, b, c);
		m.compare_value(85.78, 85.78);
		m.pi_calc();
	}
	
	public void add_one_parameter(int a)
	{
		a+=a;
		System.out.println("Value of a :"+a);
	}
	
	public void sub_two_parameter(int a, int b)
	{
		int c=a-b;
		System.out.println("Substract ="+c);
	}
	
	public void avg_three_parameter(float a,float b,float c)
	{
		float avg=(a+b+c)/3;
		//float per=(float)(a+b+c)/300*100;
		System.out.println("Average ="+avg);
		//System.out.println("Per ="+per);
	}

	public void compare_value(double n, double m)
	{
			if(n==m)
			{
				System.out.println("Values are Equal");
			}
			else
			{
				System.out.println("Values are not equal");
			}
	}
	
	public void pi_calc()
	{
		int n=22,m=7;
		float pi=(float)n/m;
		System.out.println("Value of PI :"+pi);
		
		double pi_double=(double)n/m;
		System.out.println("Value of PI :"+pi_double);
	}
}




