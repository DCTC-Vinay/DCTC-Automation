package operator;

public class ArithmeticOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperatorInJava a=new ArithmeticOperatorInJava();
		a.add();
		a.sub();
		a.mul();
		a.div();
		a.mod();
	}
	
	public void add()			//non static
	{
		int a=78,b=89,addition;	
		addition=a + b;
		
		System.out.println("Addition : "+addition);
	}

	public void sub()
	{
		int a=7,b=8,sub;	
		sub=a - b;
		
		System.out.println("Substraction : "+sub);
	}
	
	public void mul()
	{
		int a=10,b=2,mul;	
		mul=a * b;
		
		System.out.println(mul);
	}
	
	public void div()
	{
		int a=15,b=2,div;	
		div=a / b;
		
		System.out.println(div);
	}
	
	public void mod()
	{
		int a=15,b=2,mod;	
		mod=a % b;
		
		System.out.println(mod);
	}
	
}
