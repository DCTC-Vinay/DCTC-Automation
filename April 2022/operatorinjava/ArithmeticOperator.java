package operatorinjava;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperator ao=new ArithmeticOperator();
		ao.addition();
		ao.substract();
		ao.multiplication();
		ao.division();
		ao.modulus();
	}
	
	public void addition()
	{
		int a=55,b=67;
		int add=a+b;
		System.out.println("Addition :"+add);
	}
	
	public void substract()
	{
		double a=35.67,b=89.22,sub;
		sub=a-b;
		System.out.println("Substraction:"+sub);
	}
	
	public void multiplication()
	{
		float a=39.45f,b=2.5f,mul;
		mul=a*b;
		System.out.println("Multiplication:"+mul);
	}
	
	public void division()
	{
		int a=55,b=2;
		float div;
		div=(float)a/b;
		System.out.println("Division:"+div);
		
		int c=22,d=7;
		double pi=(double)c/d;
		
		System.out.println("Value of pi:"+pi);
	}
	
	public void modulus()
	{
		int a=102,b=4;
		int mod=a % b;
		System.out.println("Modulus :"+mod);
	}

}
